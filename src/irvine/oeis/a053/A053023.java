package irvine.oeis.a053;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A053023 Divisor function applied thrice to n!.
 * @author Sean A. Irvine
 */
public class A053023 extends A053021 {

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next());
  }
}
