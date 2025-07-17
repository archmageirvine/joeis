package irvine.oeis.a380;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000032;

/**
 * A380821 Length of the shorts leg in the unique primitive Pythagorean triple whose inradius is A000032(n) and such that its long leg and its hypotenuse are consecutive natural numbers.
 * @author Sean A. Irvine
 */
public class A380821 extends Sequence0 {

  private final Sequence mA = new A000032();

  @Override
  public Z next() {
    return mA.next().multiply2().add(1);
  }
}
