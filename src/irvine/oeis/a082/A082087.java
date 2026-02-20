package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a000.A000142;
import irvine.oeis.a008.A008472;

/**
 * A082087 a(n) is the fixed point if function A008472 is iterated when started at initial value n!.
 * @author Sean A. Irvine
 */
public class A082087 extends Sequence2 {

  private final Sequence mF = new A000142().skip(2);
  private final DirectSequence mA = new A008472();

  @Override
  public Z next() {
    Z t = mF.next();
    while (true) {
      final Z u = mA.a(t);
      if (u.equals(t)) {
        return t;
      }
      t = u;
    }
  }
}
