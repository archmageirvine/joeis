package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a288.A288627;

/**
 * A056435 Number of step cyclic shifted sequence structures using exactly three different symbols.
 * @author Sean A. Irvine
 */
public class A056435 extends A288627 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 3);
  }
}
