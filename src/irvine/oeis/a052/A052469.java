package irvine.oeis.a052;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052469 Denominators in the Taylor series for arccosh(x) - log(2*x).
 * @author Sean A. Irvine
 */
public class A052469 implements Sequence {

  private Q mA = Q.ONE_QUARTER;
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(2L * mN - 2).multiply(2L * mN - 1).divide(mN).divide(mN).divide(4);
    }
    return mA.den();
  }
}

