package irvine.oeis.a382;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000032;

/**
 * A382379 Length of the long leg in the unique primitive Pythagorean triple (x,y,z) such that (x-y+z)/2 is A000032(n) and such that its long leg and its hypotenuse are consecutive natural numbers.
 * @author Sean A. Irvine
 */
public class A382379 extends Sequence0 {

  private final Sequence mA = new A000032();

  @Override
  public Z next() {
    final Z t = mA.next();
    return t.subtract(1).multiply(t).multiply2();
  }
}
