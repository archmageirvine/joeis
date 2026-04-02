package irvine.oeis.a393;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001597;

/**
 * A393483 allocated for Charles L. Hohn.
 * @author Sean A. Irvine
 */
public class A393483 extends Sequence1 {

  private final Sequence mP = new A001597();
  private Z mA = mP.next();
  private Q mRecord = Q.TEN;

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mP.next();
      final Q r = new Q(mA, t);
      if (r.compareTo(mRecord) < 0) {
        mRecord = r;
        return t;
      }
    }
  }
}
