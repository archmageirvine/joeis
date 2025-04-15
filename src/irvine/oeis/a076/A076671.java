package irvine.oeis.a076;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076671 Smallest a(n) &gt; a(n-1) such that a(n)^2+a(n-1)^2 is a perfect square, with a(1)=5.
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
