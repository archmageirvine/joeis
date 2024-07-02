package irvine.oeis.a059;

import java.util.Arrays;

import irvine.math.MemoryFunction1;
import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.group.PolynomialRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A059681 Triangle T(n,k) giving number of fixed 5 X k polyominoes with n cells (n &gt;= 5, 1&lt;=k&lt;=n-4).
 * @author Sean A. Irvine
 */
public class A059681 extends AbstractSequence {

  private static final int ANIMALS = 20;
  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final MatrixRing<Polynomial<Z>> MAT_RING = new MatrixRing<>(ANIMALS, RING);
  // @formatter:off
  // Following table indicates the valid transitions
  //   u uuuuu  uuu     uuu
  //    uu    uu  u   uuuuu
  //      uvuvuu  u uu    u
  //        uvu uvuu uuvuv
  //   12345678901234567890
  private static final String TRANSITIONS =
      "#.##.#...#.#.....#.#" + // 1
      ".##....##..#...#.#.#" + // 2
      "####.#.###.#...#.#.#" + // 3
      "...#.#.....#.......#" + // 4
      "#.#.#.####...##..#.." + // 5
      "...#.#...#.#.....#.#" + // 6
      "#.#.#.###.#.####..#." + // 7
      ".###.#.###.#########" + // 8
      ".###.#.##..#.###.#.#" + // 9
      ".....#...#.#.....#.." + // 10
      "#.##..##..#.#.##..##" + // 11
      "####################" + // 12
      ".....#.#.#.##.##.#.." + // 13
      "...#.#.##..#.##....#" + // 14
      "...#.#.###.#####.#.#" + // 15
      ".......#...#...#.#.." + // 16
      ".##..#..##..#.#.#.##" + // 17
      ".....#.#.#.#...#.#.." + // 18
      "####..#.#.#.#.#.#.##" + // 19
      "##########.#.###.#.#";  // 20
  // @formatter:on
  // Number of set squares in each of the animals
  private static final int[] CONTENT = {1, 1, 2, 2, 2, 3, 3, 3, 2, 2, 2, 4, 1, 1, 2, 2, 2, 3, 3, 3};
  // Start vector, 1 means this animal can be in the leftmost column
  private static final int[] START = {1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1};
  // Stop vector, 1 means this animal can be in the rightmost column
  private static final int[] STOP = {1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1};
  private static final Matrix<Polynomial<Z>> PSI = new DefaultMatrix<>(ANIMALS, ANIMALS, RING.zero());
  private static final Matrix<Polynomial<Z>> S = new DefaultMatrix<>(ANIMALS, 1, RING.zero());
  private static final Matrix<Polynomial<Z>> P = new DefaultMatrix<>(1, ANIMALS, RING.zero());
  static {
    // Convert transition information into polynomial structures
    for (int k = 0, i = 0; k < ANIMALS; ++k) {
      if (STOP[k] == 1) {
        S.set(k, 0, RING.monomial(Z.ONE, CONTENT[k]));
      }
      P.set(0, k, Polynomial.create(START[k]));
      for (int j = 0; j < ANIMALS; ++j, ++i) {
        if (TRANSITIONS.charAt(i) == '#') {
          PSI.set(j, k, RING.monomial(Z.ONE, CONTENT[j]));
        }
      }
    }
//    System.out.println("PSI=" + PSI);
//    System.out.println("P=" + P);
//    System.out.println("S=" + S);
  }

  private int mN = 4;
  private int mM = 1;
  private final A059678 mB = new A059678();
  private final A059679 mC = new A059679();
  private final MemoryFunction1<Polynomial<Z>> mDStar = new MemoryFunction1<>() {
    @Override
    protected Polynomial<Z> compute(final int n) {
      final Matrix<Polynomial<Z>> p = MAT_RING.multiply(MAT_RING.multiply(P, MAT_RING.pow(PSI, Math.max(0, n - 1))), S);
      //System.out.println("Poly for q=" + n + ": " + p.get(0, 0));
      return p.get(0, 0);
    }
  };

  /** Construct the sequence. */
  public A059681() {
    super(5);
  }

  @Override
  public Z next() {
    build();
    return null;
//    if (++mM + 2 >= mN) {
//      ++mN;
//      mM = 1;
//    }
//    // Apply equation (5.1) of Read
//    return mDStar.get(mM).coeff(mN).subtract(mC.c(mN, mM).multiply2()).subtract(mB.b(mN, mM).multiply(3)).subtract(mN == mM ? 4 : 0);
  }

  // The following code was use to partially construct the transition matrix above
  private static final String[] CASES = {"u....",
    ".u...",
    "..u..",
    "...u.",
    "....u",
    "uu...",
    "u.u..",
    "u.v..",
    "u..u.",
    "u..v.",
    "u...u",
    "u...v",
    ".uu..",
    ".u.u.",
    ".u.v.",
    ".u..u",
    ".u..v",
    "..uu.",
    "..u.u",
    "..u.v",
    "...uu",
    "uuu..",
    "uu.u.",
    "uu.v.",
    "uu..u",
    "uu..v",
    "u.uu.",
    "u.vv.",
    "u.u.u",
    "u.u.v",
    "u.v.v",
    "u.v.u",
    "u.v.w",
    "u..uu",
    "u..vv",
    ".uuu.",
    ".uu.u",
    ".uu.v",
    ".u.uu",
    ".u.vv",
    "..uuu",
    "uuuu.",
    "uuu.u",
    "uuu.v",
    "uu.uu",
    "uu.vv",
    "u.uuu",
    "u.vvv",
    ".uuuu",
    "uuuuu"
  };

  private static int toBits(final String s) {
    int bits = 0;
    for (int k = 0; k < s.length(); ++k) {
      final char c = s.charAt(k);
      bits <<= 1;
      if (c == 'u') {
        bits |= 1;
      } else if (c != '.') {
        return -1; // not a simple u only case
      }
    }
    return bits;
  }

  private static boolean checkForward(final String a, final String b, final int k) {
    if (k >= a.length()) {
      return false;
    }
    if (a.charAt(k) != 'u') {
      return false;
    }
    if (b.charAt(k) == 'u') {
      return true;
    }
    return checkForward(a, b, k + 1);
  }

  private static boolean canFollowSimple(final String a, final String b) {
    // "a" is a simple case (only contains u)
    for (int k = 0; k < a.length(); ++k) {
      final char c = a.charAt(k);
      if (c == 'u') {
        // We need to prove this "u" has a previous "u" in b
        if (b.charAt(k) == 'u'  // Easy case, there is a "u" at the same place in b
          || (k > 0 && a.charAt(k - 1) == 'u') // There is an earlier "u" in a which we must have accepted
          || checkForward(a, b, k + 1)) {
        } else {
          return false;
        }
      }
    }
    return true;
  }

  private static boolean isForbidden1(final String a, final String b) {
    // Eliminate cases where a has a "v" that cannot occur with a "u" in b
    boolean uOk = false;
    boolean vOk = true;
    for (int k = 0; k < a.length(); ++k) {
      if (a.charAt(k) == 'u' && b.charAt(k) == 'u') {
        uOk = true;
      }
      if (a.charAt(k) == 'v' && b.charAt(k) == 'u') {
        vOk = false;
      }
    }
    return uOk && !vOk;
  }

  private static boolean isForbidden2(final String a, final String b) {
    // Eliminate cases where there is no overlap between a and b
    for (int k = 0; k < a.length(); ++k) {
      if (a.charAt(k) != '.' && b.charAt(k) != '.') {
        return false;
      }
    }
    return true;
  }

  private static boolean checkIfDies(final String a, final String b, final int k) {
    final char t = b.charAt(k);
    if (t == '.') {
      return false;
    }
    if (a.charAt(k) != '.') {
      return false; // easy case
    }
    for (int j = k - 1; j >= 0; --j) {
      if (b.charAt(j) != '.') {
        return false; // already determined it does not die
      }
    }
    for (int j = k + 1; j < b.length(); ++j) {
      if (b.charAt(j) == t && a.charAt(j) != '.') {
        return false;
      }
    }
    // Found no extension for t != .
    return true;
  }

  private static boolean isForbidden3(final String a, final String b) {
    if (a.indexOf('v') == 0 || b.indexOf('v') == 0) {
      return false;
    }
    // We have u and v in both a and b, check u and v in b does not die
    for (int k = 0; k < a.length(); ++k) {
      if (checkIfDies(a, b, k)) {
        return true;
      }
    }
    return false;
  }

  private static boolean isAllowed1(final String a, final String b) {
    // Checks for u <- u and (. <- v or v <- v)
    for (int k = 0; k < a.length(); ++k) {
      if (a.charAt(k) == 'u' && b.charAt(k) != 'u') {
        return false;
      }
      if (a.charAt(k) == 'v' && b.charAt(k) != '.' && b.charAt(k) != 'v') {
        return false;
      }
    }
    return true;
  }

  private static boolean isAllowed2(final String a, final String b) {
    // Checks for u <- v and . <- u
    // Effectively this is a swap of the roles of u and v in isAllowed1
    for (int k = 0; k < a.length(); ++k) {
      if (a.charAt(k) == 'u' && b.charAt(k) != '.') {
        return false;
      }
      if (a.charAt(k) == 'v' && b.charAt(k) != 'u') {
        return false;
      }
    }
    return true;
  }

  private static void build() {
    final char[][] transitions = new char[CASES.length][CASES.length];
    for (final char[] t : transitions) {
      Arrays.fill(t, '?');
    }
    Arrays.fill(transitions[CASES.length - 1], '#'); // uuuuu can follow anything
    for (int k = 0; k < CASES.length; ++k) {
      transitions[k][k] = '#'; // Can always follow yourself
    }
    for (int k = 0; k < CASES.length; ++k) {
      final String a = CASES[k];
      final int bk = toBits(a);
      if (bk >= 0) {
        for (int j = 0; j < CASES.length; ++j) {
          if (transitions[k][j] == '?') {
            transitions[k][j] = canFollowSimple(a, CASES[j]) ? '#' : '.';
          }
        }
      }
      for (int j = 0; j < CASES.length; ++j) {
        final String b = CASES[j];
        if (transitions[k][j] == '?') {
          if (isForbidden1(a, b) || isForbidden2(a, b) || isForbidden3(a, b)) {
            transitions[k][j] = '.';
          } else if (isAllowed1(a, b) || isAllowed2(a, b)) {
            transitions[k][j] = '#';
          }
        }
      }
    }

    // Print it
    System.out.println("  // @formatter:off");
    for (int k = 0; k < 5; ++k) {
      final StringBuilder sb = new StringBuilder("  //  ");
      for (int j = 0; j < CASES.length; ++j) {
        sb.append(CASES[j].charAt(k));
      }
      System.out.println(sb);
    }
    final StringBuilder sb = new StringBuilder("  //  ");
    for (int j = 0; j < CASES.length; ++j) {
      sb.append(j % 10);
    }
    System.out.println(sb);
    System.out.println("  private static final String TRANSITIONS =");
    for (int k = 0; k < transitions.length; ++k) {
      System.out.println("   " + (k == 0 ? " " : "+") + " \"" + new String(transitions[k]) + "\" // " + k);
    }
    System.out.println("  ;");
    System.out.println("  // @formatter:on");
  }
}

