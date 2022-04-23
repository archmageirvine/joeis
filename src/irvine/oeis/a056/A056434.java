package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a288.A288627;

/**
 * A056434 Number of step cyclic shifted sequence structures using exactly two different symbols.
 * @author Sean A. Irvine
 */
public class A056434 extends A288627 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 2);
  }
}
