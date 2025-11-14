package irvine.oeis.a384;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002378;

/**
 * A384288 Length of the long leg in the unique primitive Pythagorean triple whose inradius is A002378(n) and such that its long leg and its hypotenuse are consecutive natural numbers.
 * @author Sean A. Irvine
 */
public class A384288 extends Sequence0 {

  private final Sequence mT = new A002378();

  @Override
  public Z next() {
    final Z c = mT.next();
    return c.multiply(c.add(1)).multiply2();
  }
}
