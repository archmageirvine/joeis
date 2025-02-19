package irvine.oeis.a004;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004731 a(0) = 1; thereafter a(n) = denominator of (n-2)!! / (n-1)!!.
 * @author Sean A. Irvine
 */
public class A004731 extends Sequence0 {

  private Q mF = Q.ONE;
  private long mN = -2;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z q = mF.den();
      final Z r = mF.num().multiply(mN);
      mF = new Q(q, r);
    }
    return mF.den();
  }
}

