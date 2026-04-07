package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000142;

/**
 * A084323 Fixed points reached when prime-factor-concatenation function (A084317) is started at n!.
 * @author Sean A. Irvine
 */
public class A084323 extends Sequence1 {

  private final Sequence mS = new A000142().skip();
  private final DirectSequence mA = new A084318();

  @Override
  public Z next() {
    Z t = mS.next();
    while (true) {
      final Z s = t;
      t = mA.a(t);
      if (s.equals(t)) {
        return t;
      }
    }
  }
}
