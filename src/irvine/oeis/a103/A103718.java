package irvine.oeis.a103;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A103718 Triangle of coefficients of certain polynomials used with prime numbers as variables in the computation of the array A103728.
 * a(0, 0)=1, a(k, 0) = (k-1)! + k*a(k-1, 0); a(k, m) = -a(k-1, m-1) + k*a(k-1, m), m > 0 and a(k, m)=0 if k < m.
 * @author Georg Fischer
 */
public class A103718 extends Triangle {

  private Z mFact = Z.ONE;

  /** Construct the sequence. */
  public A103718() {
    hasRAM(false);
  }

  @Override
  public Z compute(final int k, final int m) {
    if (k == 0) {
      return Z.ONE;
    } else {
      Z result = get(k - 1, m).multiply(k);
      if (m == 0) {
        result = result.add(mFact);
        mFact = mFact.multiply(k);
      } else {
        result = result.subtract(get(k - 1, m - 1));
      }
      return result;
    }
  }
}
