package irvine.oeis.a392;

import java.util.Comparator;
import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;
import irvine.util.Permutation;

/**
 * A392045 Odd positive integers whose canonical prime factorization p_1^e_1*...*p_r^e_r satisfies that {p_1, ..., p_r, e_1, ..., e_r} is a set of 2*r consecutive integers.
 * @author Sean A. Irvine
 */
public class A392045 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>(); // queue of known terms
  private final TreeSet<Pair<Integer, Integer>> mGenerators = new TreeSet<>(Comparator.comparing(A392045::min));
  {
    mGenerators.add(new Pair<>(2, 3));
  }

  private static Z min(final Pair<Integer, Integer> p) {
    final int a = p.left();
    final int b = p.right();
    Z prod = Z.ONE;
    if ((a & 1) == 0) {
      for (int k = a + 1, j = b - 1; k <= b; k += 2, j -= 2) {
        prod = prod.multiply(Z.valueOf(k).pow(j));
      }
    } else {
      for (int k = a, j = b; k <= b; k += 2, j -= 2) {
        prod = prod.multiply(Z.valueOf(k).pow(j));
      }
    }
    return prod;
  }

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(min(mGenerators.first())) > 0) {
      final Pair<Integer, Integer> g = mGenerators.pollFirst();
      final int lo = g.left();
      final int hi = g.right();
      final int delta = lo & 1;
      final Permutation perm = new Permutation((hi + 1 - lo) / 2); // powers
      int[] p;
      while ((p = perm.next()) != null) {
        Z prod = Z.ONE;
        for (int k = 0; k < p.length; ++k) {
          prod = prod.multiply(Z.valueOf(lo + 1 - delta + 2L * k).pow(lo + delta + 2L * p[k]));
        }
        mA.add(prod);
      }
      if (Predicates.PRIME.is(hi + 2 - delta)) {
        mGenerators.add(new Pair<>(lo, hi + 2));
      }
      if (hi - lo == 1) {
        if (delta == 1) {
          final int q = Functions.NEXT_PRIME.i(lo);
          mGenerators.add(new Pair<>(q - 1, q));
        } else {
          mGenerators.add(new Pair<>(hi, hi + 1));
        }
      }
    }
    return mA.pollFirst();
  }
}

