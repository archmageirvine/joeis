package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.a008.A008475;

/**
 * A082085 Fixed points when A008475 is iterated started at factorials of prime numbers.
 * @author Sean A. Irvine
 */
public class A082085 extends Sequence1 {

  private final DirectSequence mA = new A008475();
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
