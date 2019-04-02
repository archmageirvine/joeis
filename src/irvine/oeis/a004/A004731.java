package irvine.oeis.a004;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004731 Denominator of n!!/(n+1)!! (cf. A006882).
 * @author Sean A. Irvine
 */
public class A004731 implements Sequence {

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

