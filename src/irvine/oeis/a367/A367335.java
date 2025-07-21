package irvine.oeis.a367;

import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A367335 Long leg of the only primitive Pythagorean triple whose inradius is the n-th odd prime and whose short leg is an even number.
 * @author Sean A. Irvine
 */
public class A367335 extends A065091 {

  @Override
  public Z next() {
    final Z p = super.next();
    return p.square().add(p.multiply2());
  }
}
