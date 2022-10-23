package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004081 a(n) = n-th positive integer such that only one integer lies between exp(s(m)) and exp(s(m+1)), where s(m) = 1 + 1/2 + 1/3 + . . . + 1/m.
 * @author Sean A. Irvine
 */
public class A004081 extends Sequence1 {

  private Q mA = Q.ONE;
  private CR mExpA = CR.valueOf(mA).exp();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mA = mA.add(new Q(1, ++mN));
      final CR expn = CR.valueOf(mA).exp();
      final boolean match = expn.floor().equals(mExpA.ceil());
      mExpA = expn;
      if (match) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}

