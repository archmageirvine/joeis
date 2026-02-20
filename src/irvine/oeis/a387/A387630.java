package irvine.oeis.a387;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005117;

/**
 * A387630 A005117(k) - 1 such that A389412(k) is a record value.
 * @author Sean A. Irvine
 */
public class A387630 extends Sequence1 {

  private final DirectSequence mA = DirectSequence.create(new A005117());
  private int mN = 1;
  private int mBest = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = mA.a(++mN).subtract(1);
      int cnt = 1;
      while (Predicates.SQUARE_FREE.is(t.add(mA.a(cnt)))) {
        ++cnt;
      }
      if (cnt > mBest) {
        mBest = cnt;
        return t;
      }
    }
  }
}
