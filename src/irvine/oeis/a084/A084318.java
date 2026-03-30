package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A084318 Iterate function described in A084317 if started at initial value n until reaching a fixed point.
 * @author Sean A. Irvine
 */
public class A084318 extends Sequence1 implements DirectSequence {

  private final DirectSequence mA = new A084317();
  private long mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    Z t = n;
    while (true) {
      final Z s = t;
      t = mA.a(t);
      if (s.equals(t)) {
        return t;
      }
    }
  }

  @Override
  public Z a(final long n) {
    return a(Z.valueOf(n));
  }
}
