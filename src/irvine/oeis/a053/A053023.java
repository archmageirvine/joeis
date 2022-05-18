package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A053023 Divisor function applied thrice to n!.
 * @author Sean A. Irvine
 */
public class A053023 extends A053021 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma0();
  }
}
