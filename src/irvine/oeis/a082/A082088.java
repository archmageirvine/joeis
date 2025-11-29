package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.a008.A008472;

/**
 * A082088 a(n) is the fixed point if function A008472 is iterated when started at initial value prime[n]!.
 * @author Sean A. Irvine
 */
public class A082088 extends Sequence1 {

  private final DirectSequence mA = new A008472();
  private final Sequence mP = new A000040();

  @Override
  public Z next() {
    Z t = Functions.FACTORIAL.z(mP.next());
    while (true) {
      final Z u = mA.a(t);
      if (u.equals(t)) {
        return t;
      }
      t = u;
    }
  }
}
