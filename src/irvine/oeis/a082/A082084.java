package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000142;
import irvine.oeis.a001.A001414;

/**
 * A082084 a(n) = A029908(n!) = A029908(A000142(n)); fixed points of iterated A001414 function if started at factorials as initial values.
 * @author Sean A. Irvine
 */
public class A082084 extends Sequence1 {

  private final Sequence mF = new A000142().skip();
  private final DirectSequence mA = new A001414();

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
