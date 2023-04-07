package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062707 Table by antidiagonals of n*k*(k+1)/2.
 * @author Sean A. Irvine
 */
public class A062707 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  private Z t(final long n, final long m) {
    return Z.valueOf(n).multiply(m).multiply(m + 1).divide2();
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
