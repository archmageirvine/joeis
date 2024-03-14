package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068744.
 * @author Sean A. Irvine
 */
public class A068747 extends A068744 {

  private int mN = -1;

  @Override
  public Z next() {
    return potentialFlows(++mN, 6);
  }
}
