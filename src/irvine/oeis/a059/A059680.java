package irvine.oeis.a059;

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
 * A059680.
 * @author Sean A. Irvine
 */
public class A059680 extends AbstractSequence {

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
  public static final String TRANSITIONS =
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
      ".##..#..#...#.#.#.##" + // 17
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
    System.out.println("PSI=" + PSI);
    System.out.println("P=" + P);
    System.out.println("S=" + S);
  }

  // todo could be errors in PSI

  private int mN = 3;
  private int mM = 1;
  private final A059678 mB = new A059678();
  private final A059679 mC = new A059679();
  private final MemoryFunction1<Polynomial<Z>> mDStar = new MemoryFunction1<>() {
    @Override
    protected Polynomial<Z> compute(final int n) {
      final Matrix<Polynomial<Z>> p = MAT_RING.multiply(MAT_RING.multiply(P, MAT_RING.pow(PSI, Math.max(0, n - 1))), S);
      System.out.println("Poly for q=" + n + ": " + p.get(0, 0));
      return p.get(0, 0);
    }
  };

  /** Construct the sequence. */
  public A059680() {
    super(4);
  }

  @Override
  public Z next() {
    if (++mM + 2 >= mN) {
      ++mN;
      mM = 1;
    }
    // Apply equation (5.1) of Read
    //System.out.println("n=" + mN + " m=" + mM + " [x^" + mN + "] " + mDStar.get(mM));
    return mDStar.get(mM).coeff(mN).subtract(mC.c(mN, mM).multiply2()).subtract(mB.b(mN, mM).multiply(3)).subtract(mN == mM ? 4 : 0);
  }
}

