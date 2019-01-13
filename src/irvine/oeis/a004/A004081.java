package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004081.
 * @author Sean A. Irvine
 */
public class A004081 implements Sequence {

  private Q mA = Q.ONE;
  private CR mExpA = CR.valueOf(mA).exp();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mA = mA.add(new Q(1, ++mN));
      final CR expn = CR.valueOf(mA).exp();
      final boolean match = expn.floor(32).equals(mExpA.ceil(32));
      mExpA = expn;
      if (match) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}

