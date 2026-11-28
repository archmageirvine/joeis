package irvine.math.group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import irvine.math.z.Z;

/**
 * Necessary permutation degrees from certified abstract group structures.
 * @author Gregory Morse
 */
final class StructuralPermutationObstructions {

  private static final Pattern LINEAR_TWO = Pattern.compile("C2 x (?:PGL\\(2,(\\d+)\\)|PSL\\(2,(\\d+)\\):C2)");
  private static final Pattern SYMMETRIC_FACTORS = Pattern.compile("C2 x S\\d+(?: x S\\d+)*(?: = .*)?");
  private static final Pattern DOUBLE_SYMMETRIC = Pattern.compile("C2 x \\(S(\\d+) x S\\1\\):C2");
  private static final Pattern DOUBLE_PROJECTIVE = Pattern.compile("\\(C2 x PSL\\(2,(\\d+)\\) x PSL\\(2,\\1\\)\\)\\.\\(C2 x C2\\)");

  private StructuralPermutationObstructions() { }

  private static Z factorial(final int n) {
    Z result = Z.ONE;
    for (int i = 2; i <= n; ++i) {
      result = result.multiply(i);
    }
    return result;
  }

  private static boolean hasAlternatingOrder(final int letters, final int lower, final int required, final int order, final boolean odd) {
    if (letters == 0) {
      return order == required && !odd;
    }
    for (int i = lower; i <= letters; ++i) {
      if (required % i == 0) {
        final int lcm = order * i / gcd(order, i);
        if (hasAlternatingOrder(letters - i, i, required, lcm, odd ^ ((i & 1) == 0))) {
          return true;
        }
      }
    }
    return false;
  }

  private static int gcd(int a, int b) {
    while (b != 0) {
      final int r = a % b;
      a = b;
      b = r;
    }
    return a;
  }

  static boolean excludesAlternatingCoverOrder(final String type, final Z order, final int elementOrder) {
    final Matcher cover = Pattern.compile("C2\\.A(\\d+)").matcher(type);
    if (!cover.matches()) {
      return false;
    }
    final int letters = Integer.parseInt(cover.group(1));
    return order.equals(factorial(letters)) && !hasAlternatingOrder(letters, 1, elementOrder, 1, false)
      && ((elementOrder & 1) == 1 || !hasAlternatingOrder(letters, 1, elementOrder / 2, 1, false));
  }

  private static boolean possibleIndex(final int degree, final int... maximalIndices) {
    for (final int index : maximalIndices) {
      if (degree % index == 0) {
        return true;
      }
    }
    return false;
  }

  private static boolean simpleTooLargeForFactors(final Z simpleOrder, final int degree, final Z... factors) {
    if (factorial(degree).mod(simpleOrder).isZero()) {
      return false;
    }
    return Arrays.stream(factors).noneMatch(x -> x.mod(simpleOrder).isZero());
  }

  static boolean excludesProduct(final String source, final Z sourceOrder, final String target, final Z targetOrder) {
    final String product = target.split(" = ", 2)[0];
    if ("W(F4) x S6 = W(F4) x W(A5)".equals(source) && sourceOrder.equals(factorial(6).multiply(1152))
      && "W(F4) wr S5".equals(product) && targetOrder.equals(Z.valueOf(1152).pow(5).multiply(factorial(5)))) {
      return simpleTooLargeForFactors(factorial(6).divide2(), 5, Z.valueOf(1152));
    }
    if ("(SU(4,2) x C6).C2".equals(source) && sourceOrder.equals(Z.valueOf(311040))
      && "(C2 x S3) wr S10".equals(product) && targetOrder.equals(Z.valueOf(12).pow(10).multiply(factorial(10)))) {
      // SU(4,2) is simple and has no permutation action on at most
      // ten points; the base of this wreath product is solvable.
      return true;
    }
    if ("C2 x S3 x PGL(2,11)".equals(source) && sourceOrder.equals(Z.valueOf(15840))
      && "C2 x S3 x S11".equals(product) && targetOrder.equals(factorial(11).multiply(12))) {
      // The projection of PGL(2,11) to S11 is faithful: its simple
      // subgroup cannot map into the solvable factors and the
      // centralizer of that subgroup is trivial. It would act
      // transitively, as PSL(2,11) has no smaller nontrivial orbit.
      // ATLAS: https://brauer.maths.qmul.ac.uk/Atlas/v3/lin/L211/
      return !possibleIndex(11, 2, 12, 55, 55, 66);
    }
    if ("(C2 x PSp(4,5)).C2".equals(source) && sourceOrder.equals(Z.valueOf(18720000))) {
      final Z simple = Z.valueOf(4680000);
      if ("(C2 x S14) wr C2".equals(product) && targetOrder.equals(factorial(14).shiftLeft(1).square().shiftLeft(1))) {
        return simpleTooLargeForFactors(simple, 2, factorial(14));
      }
      if ("(C2 x PSL(2,25):C2) wr C2".equals(product) && targetOrder.equals(Z.valueOf(31200).square().shiftLeft(1))) {
        return simpleTooLargeForFactors(simple, 2, Z.valueOf(15600));
      }
    }
    if ("C2 x S3 x S14".equals(product) && targetOrder.equals(factorial(14).multiply(12))) {
      if ("C2 x PGL(4,3)".equals(source) && sourceOrder.equals(Z.valueOf(24261120))) {
        return simpleTooLargeForFactors(Z.valueOf(6065280), 1, factorial(14), Z.valueOf(6));
      }
      if ("C2 x PSL(2,25):C2".equals(source) && sourceOrder.equals(Z.valueOf(31200))) {
        // PSL(2,25) has a C5^2 acted on by its square multipliers.
        // The induced orbits on stabilizer lines have length three,
        // so a faithful action needs at least 15 points.
        return true;
      }
    }
    return false;
  }

  static boolean admitsDerivedObstruction(final String target, final Z targetOrder) {
    return "C2 x S3 x PSL(2,25):C2".equals(target) && targetOrder.equals(Z.valueOf(187200))
      || "(C2 x PSp(6,3) x C3).C2".equals(target) && targetOrder.equals(Z.valueOf(55024220160L));
  }

  private static boolean excludesOuterInvolution(final int degree, final int[] outer, final int[] simple) {
    // A candidate stabilizer lies in some maximal subgroup. If that
    // subgroup is the simple subgroup of index two, test there as well.
    return !possibleIndex(degree, outer) && (degree % 2 != 0 || degree != 2 && !possibleIndex(degree / 2, simple));
  }

  private static boolean prime(final int p) {
    if (p < 2) {
      return false;
    }
    for (int d = 2; d * d <= p; ++d) {
      if (p % d == 0) {
        return false;
      }
    }
    return true;
  }

  static boolean excludesTransitiveAction(final String type, final Z order, final int degree) {
    if ("C2.Co1".equals(type) && order.equals(new Z("8315553613086720000"))) {
      // In a signed-line action the central scalar acts trivially.
      // ATLAS Co1: the least proper subgroup index is 98280.
      return degree > 1 && degree < 98280;
    }
    if (("C2 x SL(3,3):C2".equals(type) || "C2 x PGL(3,3):C2".equals(type)) && order.equals(Z.valueOf(4 * 5616))) {
      // ATLAS: https://brauer.maths.qmul.ac.uk/Atlas/v3/lin/L33/
      return excludesOuterInvolution(degree, new int[] {52, 117, 144, 234}, new int[] {13, 144, 234});
    }
    if ("C2 x PSL(3,5):C2".equals(type) && order.equals(Z.valueOf(4 * 372000))) {
      // ATLAS: https://brauer.maths.qmul.ac.uk/Atlas/v3/lin/L35/
      return excludesOuterInvolution(degree, new int[] {186, 775, 3100, 3875, 4000}, new int[] {31, 3100, 3875, 4000});
    }
    if ("C2 x PSL(2,32):C5".equals(type) && order.equals(Z.valueOf(10 * 32 * (32 * 32 - 1)))) {
      // The simple factor has minimum proper index 33 (ATLAS L2(32));
      // a transitive action above degree five cannot kill that factor.
      return degree > 5 && degree < 33;
    }
    if (("C2 x Sp(6,2)".equals(type) || "W(E7)".equals(type)) && order.equals(Z.valueOf(2L * 1451520))) {
      // ATLAS Sp(6,2): minimum proper index 28.
      return degree > 2 && degree < 28;
    }
    final Matcher linear = LINEAR_TWO.matcher(type);
    if (linear.matches()) {
      final int q = Integer.parseInt(linear.group(linear.group(1) == null ? 2 : 1));
      final int p = (int) Math.sqrt(q);
      if (p > 2 && p * p == q && prime(p) && order.equals(Z.valueOf(2L * q * (q * q - 1L)))) {
        // The simple factor PSL(2,p^2) must act faithfully if it acts
        // nontrivially. It has a C_p^2 unipotent subgroup normalized by
        // multiplication by the squares of F_(p^2)^*. Those squares
        // have orbits of length (p+1)/2 on the subgroup's projective
        // lines. An orbit of C_p^2 of size p requires one orbit for
        // every stabilizer line in its normalizer orbit. Otherwise a
        // nontrivial orbit already has size p^2.
        final int minimum = p * (p + 1) / 2;
        final Z simple = order.divide(4);
        if (4 % degree != 0) {
          for (int d = minimum; d <= degree; ++d) {
            if (degree % d == 0 && simple.mod(d) == 0) {
              return false;
            }
          }
          return true;
        }
      }
    }
    final Matcher product = DOUBLE_SYMMETRIC.matcher(type);
    if (product.matches()) {
      final int k = Integer.parseInt(product.group(1));
      final Z orderS = factorial(k);
      final Z orderA = orderS.divide2();
      final int p = (int) Math.sqrt(degree);
      if (k >= 5 && p > 2 && p * p == degree && prime(p) && order.equals(orderS.square().shiftLeft(2))
        && orderA.compareTo(factorial(p)) > 0 && orderA.mod(degree) != 0) {
        // The normal A_k^2 has equally sized orbits on a transitive
        // set. Its quotient has order sixteen, so some A_k^2 orbit
        // is nontrivial. Neither A_k has proper index p or p^2. Thus
        // an orbit stabilizer of either index would project onto both
        // factors. Goursat leaves only the full or diagonal subgroup.
        return true;
      }
    }
    if ("C2 x S9".equals(type) && order.equals(factorial(9).shiftLeft(1)) && degree == 28) {
      // A9 would have an orbit of length 14 or 28. An A9 subgroup of
      // either index retains the full 3-part of 9!, so is transitive
      // on the nine letters (every nontrivial partition of 3^2 has a
      // 3-divisible multinomial). Its order is at least 6480 > 6^4,
      // ruling out the 3-by-3 imprimitive case. It contains a 5-cycle;
      // Jordan's prime-cycle theorem would then force it to be A9.
      return true;
    }
    return false;
  }

  private static void partitions(final int left, final int max, final int[] rows, final int count,
                                 final Z factorial, final int limit, final Set<Integer> degrees) {
    if (left != 0) {
      for (int head = Math.min(left, max); head >= 1; --head) {
        rows[count] = head;
        partitions(left - head, head, rows, count + 1, factorial, limit, degrees);
      }
      return;
    }
    Z hooks = Z.ONE;
    boolean symmetric = rows[0] == count;
    for (int j = 0; j < rows[0]; ++j) {
      int height = 0;
      while (height < count && rows[height] > j) {
        ++height;
      }
      symmetric &= j < count && height == rows[j];
      for (int i = 0; i < height; ++i) {
        hooks = hooks.multiply(rows[i] - j + height - i - 1L);
      }
    }
    Z d = factorial.divide(hooks);
    if (symmetric) {
      d = d.divide2();
    }
    if (!d.isOne() && d.compareTo(Z.valueOf(limit)) <= 0) {
      degrees.add(d.intValueExact());
    }
  }

  static boolean excludesBlocks(final String type, final Z order, final int blocks, final int rank) {
    if (rank == 2 && excludesSolvableBlockAction(type, order, blocks)) {
      return true;
    }
    if ("(C2 x PSU(6,2)).S3".equals(type)) {
      Z simple = Z.ONE.shiftLeft(15);
      for (int i = 2; i <= 6; ++i) {
        simple = simple.multiply((1 << i) - ((i & 1) == 0 ? 1 : -1));
      }
      simple = simple.divide(3);
      if (order.equals(simple.multiply(12)) && simple.compareTo(factorial(blocks)) > 0 && rank < 6 && simple.mod(7) == 0) {
        return true;
      }
    }
    final Matcher product = DOUBLE_PROJECTIVE.matcher(type);
    if (product.matches() && (blocks & 1) != 0) {
      final int p = Integer.parseInt(product.group(1));
      if (p > 3 && prime(p)) {
        final Z simple = Z.valueOf(p * (p * p - 1L) / 2);
        if (simple.square().shiftLeft(3).equals(order) && simple.compareTo(factorial(blocks)) > 0 && rank < 2 * (p - 1)) {
          // Both simple factors fix every block. If both acted on one
          // block, their product would act faithfully, hence so would
          // C_p^2. A faithful rational representation of C_p^2 needs
          // two distinct character orbits of degree p-1. Thus exactly
          // one factor acts on each block (the common fixed space is
          // H-invariant and zero). Transitivity and faithfulness force
          // the two factors to have equally many blocks, impossible
          // with an odd number of blocks.
          return true;
        }
      }
    }
    if (!SYMMETRIC_FACTORS.matcher(type).matches()) {
      return false;
    }
    final String prefix = type.split(" = ", 2)[0];
    final int[] factors = Arrays.stream(prefix.substring(5).split(" x ")).mapToInt(s -> Integer.parseInt(s.substring(1))).toArray();
    Z productOrder = Z.TWO;
    for (final int n : factors) {
      productOrder = productOrder.multiply(factorial(n));
    }
    return productOrder.equals(order) && Arrays.stream(factors).anyMatch(n -> n >= 5 && n <= 31 && blocks < n && excludesAlternatingDegree(n, rank));
  }

  private static boolean excludesSolvableBlockAction(final String type, final Z order, final int blocks) {
    // A finite rational group on each rank-two block is solvable.
    // A nontrivial perfect subgroup must act on the blocks and
    // cannot have a proper orbit below its least subgroup index.
    switch (type) {
      case "(W(A2) x W(E7)) wr C2":
        return order.equals(Z.valueOf(17418240).square().multiply(2)) && blocks < 28;
      case "(C2 x S3 x G2(3)).C2":
        return order.equals(Z.valueOf(4245696).multiply(24)) && factorial(blocks).mod(4245696) != 0;
      case "S3 x (PSU(3,3) x C4).C2":
        return order.equals(Z.valueOf(6048 * 48)) && blocks < 28;
      case "((C6 x PSU(4,2)).C2) wr S3":
        return order.equals(Z.valueOf(311040).pow(3).multiply(6)) && blocks < 27;
      case "(C2 x PSU(4,2)):C2":
        return order.equals(Z.valueOf(25920 * 4)) && blocks < 27;
      case "(C2 x C3.PSL(3,4)).(C2 x C2)":
        return order.equals(Z.valueOf(20160 * 24)) && blocks < 21;
      case "C2 x W(A2) x Sp(6,2)":
        return order.equals(Z.valueOf(1451520 * 12)) && blocks < 28;
      case "C2 x W(A2) x W(A6)":
        // The normal A7 has equal-sized orbits, all of size at
        // least seven in a nontrivial action. Only 15 can divide 15.
        return order.equals(Z.valueOf(60480)) && blocks == 15 && NoIndexFifteenS7.VALUE;
      case "C2 x C3.S7":
        // If the center of 3.A7 acts nontrivially on 15 transitive
        // points it has five orbits. Then A7 acts transitively on
        // those five orbits, impossible. The action descends to S7.
        return order.equals(Z.valueOf(30240)) && blocks == 15 && NoIndexFifteenS7.VALUE;
      default:
        return false;
    }
  }

  private static final class NoIndexFifteenS7 {
    private static final boolean VALUE = prove();

    private static void permutations(final char[] word, final int at, final int used, final List<char[]> result) {
      if (at == word.length) {
        result.add(word.clone());
      } else {
        for (int i = 0; i < word.length; ++i) {
          if ((used & (1 << i)) == 0) {
            word[at] = (char) i;
            permutations(word, at + 1, used | (1 << i), result);
          }
        }
      }
    }

    private static boolean orderDivides336(final char[] shift, final char[] scale, final char[] third) {
      final List<char[]> words = new ArrayList<>();
      final Set<String> known = new HashSet<>();
      words.add(new char[] {0, 1, 2, 3, 4, 5, 6});
      known.add(new String(words.get(0)));
      for (int i = 0; i < words.size(); ++i) {
        for (final char[] move : new char[][] {shift, scale, third}) {
          final char[] word = RationalOrbitStabilizers.product(words.get(i), move);
          if (known.add(new String(word))) {
            if (words.size() == 336) {
              return false;
            }
            words.add(word);
          }
        }
      }
      return 336 % words.size() == 0;
    }

    private static boolean prove() {
      // A subgroup of order 336 would have eight Sylow 7-subgroups
      // (one would put it inside the order-42 normalizer). It must
      // therefore contain one full affine normalizer of order 42.
      final List<char[]> affine = new ArrayList<>();
      final Set<String> seen = new HashSet<>();
      for (int a = 1; a < 7; ++a) {
        for (int b = 0; b < 7; ++b) {
          final char[] p = new char[7];
          for (int i = 0; i < p.length; ++i) {
            p[i] = (char) ((a * i + b) % 7);
          }
          affine.add(p);
          seen.add(new String(p));
        }
      }
      final List<char[]> symmetric = new ArrayList<>();
      permutations(new char[7], 0, 0, symmetric);
      for (final char[] p : symmetric) {
        if (seen.add(new String(p))) {
          // One test per double coset of the affine normalizer.
          for (final char[] l : affine) {
            final char[] lp = RationalOrbitStabilizers.product(l, p);
            for (final char[] r : affine) {
              seen.add(new String(RationalOrbitStabilizers.product(lp, r)));
            }
          }
          if (orderDivides336(affine.get(1), affine.get(14), p)) {
            return false;
          }
        }
      }
      return true;
    }
  }

  private static boolean excludesAlternatingDegree(final int n, final int rank) {
    // The normal simple A_n cannot act on fewer than n blocks. As its
    // fixed space is H-invariant and H is rationally irreducible, it
    // has no trivial constituent on any preserved block. Compute the
    // nontrivial dimensions by the hook and restriction rules.
    final Set<Integer> dimensions = new HashSet<>();
    partitions(n, n, new int[n], 0, factorial(n), rank, dimensions);
    final boolean[] sums = new boolean[rank + 1];
    sums[0] = true;
    for (int i = 1; i <= rank; ++i) {
      for (final int d : dimensions) {
        if (d <= i && sums[i - d]) {
          sums[i] = true;
          break;
        }
      }
    }
    return !sums[rank];
  }
}
