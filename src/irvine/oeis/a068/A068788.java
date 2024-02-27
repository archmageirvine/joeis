package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068620.
 * @author Sean A. Irvine
 */
public class A068788 extends A068620 {

  private int mN = 0;

  @Override
  public Z next() {
    return mS.get(++mN, 1, 3);
  }
}
