package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a008.A008475;

/**
 * A082081 a(n) = fixed point when the pseudo-log function A008475[ ] is iterated.
 * @author Sean A. Irvine
 */
public class A082081 extends Sequence1 {

  private final DirectSequence mA = new A008475();
  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN);
    while (true) {
      final Z u = mA.a(t);
      if (u.equals(t)) {
        return t;
      }
      t = u;
    }
  }
}
