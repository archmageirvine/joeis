package irvine.oeis.a008;

import irvine.math.z.Z;

/**
 * A008280 Boustrophedon version of triangle of Euler-Bernoulli or Entringer numbers read by rows.
 * @author Sean A. Irvine
 */
public class A008280 extends A008281 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, (mN & 1) == 1 ? mM : mN - mM);
  }
}

