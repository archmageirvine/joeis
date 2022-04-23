package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a288.A288627;

/**
 * A056437 Number of step cyclic shifted sequence structures using exactly five different symbols.
 * @author Sean A. Irvine
 */
public class A056437 extends A288627 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 5);
  }
}
