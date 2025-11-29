package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000142;
import irvine.oeis.a008.A008475;

/**
 * A082083 a(n) = A082081(n!) = A082081(A000142(n)); fixed points of iterated A008475 function initiated at factorials as initial values.
 * @author Sean A. Irvine
 */
public class A082083 extends Sequence1 {

  private final Sequence mF = new A000142().skip();
  private final DirectSequence mA = new A008475();

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
