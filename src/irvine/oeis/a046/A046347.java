package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a071.A071904;

/**
 * A046347 Odd composite numbers divisible by the sum of their prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046347 extends Sequence1 {

  private final Sequence mA = new A071904();

  @Override
  public Z next() {
    while (true) {
      final Z c = mA.next();
      if (c.mod(Jaguar.factor(c).sopfr()).isZero()) {
        return c;
      }
    }
  }
}
