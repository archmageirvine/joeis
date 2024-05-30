package irvine.oeis.a018;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A018883 Least nonsquare having square residues for all moduli 2 through n.
 * @author Sean A. Irvine
 */
public class A018883 extends Sequence2 {

  private long mN = 1;
  private long mM = 2;

  private boolean isSquare(final long n) {
    final long r = Functions.SQRT.l(n);
    return r * r == n;
  }

  private boolean isSquare(final long r, final long m) {
    // There are smarter ways to do this ... see Euler criterion
    for (long k = 0; k < m; ++k) {
      if ((k * k) % m == r) {
        return true;
      }
    }
    return false;
  }

  private boolean isSquareResidues(final long m, final long n) {
    for (long k = n; k >= 2; --k) {
      if (!isSquare(m % k, k)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (isSquare(mM) || !isSquareResidues(mM, mN)) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
