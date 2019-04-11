package irvine.oeis.a004;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004824 Denominator of <code>2^n*(3*n-3)!/( ((n-1)!)^3 * (2*n)! )</code>.
 * @author Sean A. Irvine
 */
public class A004824 implements Sequence {

  private Q mA = Q.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 3) {
      mA = mA.multiply(3 * mN - 4).multiply(3 * mN - 5).multiply(3).divide(mN).divide(2 * mN - 1).divide(mN - 1).divide(mN - 1);
    }
    return mA.den();
  }
}

