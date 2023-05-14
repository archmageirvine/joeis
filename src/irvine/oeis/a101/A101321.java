package irvine.oeis.a101;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A101321 Table T(n,m) = 1 + n*m*(m+1)/2 read by antidiagonals: centered polygonal numbers.
 * @author Sean A. Irvine
 */
public class A101321 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  private Z t(final long n, final long m) {
    return Z.valueOf(n).multiply(m).multiply(m + 1).divide2().add(1);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM);
  }
}
