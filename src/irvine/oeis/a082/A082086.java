package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.a001.A001414;

/**
 * A082086 Fixed points when A001414 is iterated and started at factorials of prime numbers.
 * @author Sean A. Irvine
 */
public class A082086 extends Sequence1 {

  private final DirectSequence mA = new A001414();
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
