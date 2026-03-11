package irvine.oeis.a393;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a051.A051038;

/**
 * A393773 11-smooth numbers k = s(i) such that s(i)/s(i+1) sets a record high, where s = A051038.
 * @author Sean A. Irvine
 */
public class A393773 extends Sequence1 {

  private final Sequence mSmooth = new A051038();
  private Z mA = mSmooth.next();
  private Q mBest = Q.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z s = mA;
      mA = mSmooth.next();
      final Q r = new Q(s, mA);
      if (r.compareTo(mBest) > 0) {
        mBest = r;
        return s;
      }
    }
  }
}
