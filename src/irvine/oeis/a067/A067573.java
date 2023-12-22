package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.q.Q;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067564.
 * @author Sean A. Irvine
 */
public class A067573 extends Sequence1 {

  private long mN = 1;
  private Q mRecord = Q.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Q a = new Q(Jaguar.factor(Euler.phi(++mN)).sigma(), Jaguar.factor(mN).sigma());
      if (a.compareTo(mRecord) > 0) {
        mRecord = a;
        return Z.valueOf(mN);
      }
    }
  }
}
