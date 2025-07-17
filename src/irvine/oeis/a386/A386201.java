package irvine.oeis.a386;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000032;

/**
 * A386201 Lengths of the long leg in the unique primitive Pythagorean triple whose inradius is A000032(n) and such that its long leg and its hypotenuse are consecutive natural numbers.
 * @author Sean A. Irvine
 */
public class A386201 extends Sequence0 {

  private final Sequence mA = new A000032();

  @Override
  public Z next() {
    final Z t = mA.next();
    return t.add(1).multiply(t).multiply2();
  }
}
