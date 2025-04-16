package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076775 Greatest common divisor of n and the binary representation of n interpreted decimally.
 * @author Sean A. Irvine
 */
public class A076775 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.GCD.z(++mN, new Z(Long.toBinaryString(mN)));
  }
}
