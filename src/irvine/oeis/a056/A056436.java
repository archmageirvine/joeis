package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a288.A288627;

/**
 * A056436 Number of step cyclic shifted sequence structures using exactly four different symbols.
 * @author Sean A. Irvine
 */
public class A056436 extends A288627 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 4);
  }
}
