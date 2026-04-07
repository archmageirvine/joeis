package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002110;

/**
 * A084322 Fixed points if prime-factor-concatenation function (A084317) is iterated at primorial number initial values.
 * @author Sean A. Irvine
 */
public class A084322 extends Sequence1 {

  private final Sequence mS = new A002110().skip();
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
