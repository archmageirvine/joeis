package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a288.A288627;

/**
 * A056433 Step cyclic shifted sequence structures using a maximum of six different symbols.
 * @author Sean A. Irvine
 */
public class A056433 extends A288627 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 6).add(t(mN, 5)).add(t(mN, 4)).add(t(mN, 3)).add(t(mN, 2)).add(1);
  }
}
