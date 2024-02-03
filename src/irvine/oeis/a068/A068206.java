package irvine.oeis.a068;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068192.
 * @author Sean A. Irvine
 */
public class A068206 extends Sequence1 {

  private final BernoulliSequence mB = new BernoulliSequence(0);
  private Q mA = mB.nextQ();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Q t = mA;
      mB.nextQ();
      mA = mB.nextQ();
      if (mA.num().gcd(t.den()).equals(Z.SEVEN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
