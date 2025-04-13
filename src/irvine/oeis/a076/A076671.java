package irvine.oeis.a076;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076600.
 * @author Sean A. Irvine
 */
public class A076671 extends Sequence1 {

  private final Z mStart;
  private Z mA = null;

  protected A076671(final Z start) {
    mStart = start;
  }

  /** Construct the sequence. */
  public A076671() {
    this(Z.FIVE);
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = mStart;
    } else {
      final Z s = mA.square();
      Z t = mA;
      while (true) {
        t = t.add(1);
        if (Predicates.SQUARE.is(s.add(t.square()))) {
          mA = t;
          break;
        }
      }
    }
    return mA;
  }
}
