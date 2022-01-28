package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A054249 Alternately subtract and add 1 to digits in decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A054249 extends A000796 {

  private long mN = 1;

  @Override
  public Z next() {
    mN = -mN;
    return super.next().add(mN);
  }
}
