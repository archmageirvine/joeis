package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025597 Number of n-move king paths on <code>8 X 8</code> board from given corner to opposite corner.
 * @author Sean A. Irvine
 */
public class A025597 extends A025596 {

  private int mN = -1;

  @Override
  public Z next() {
    return get(++mN, 7, 7);
  }
}
