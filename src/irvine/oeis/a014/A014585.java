package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014585.
 * @author Sean A. Irvine
 */
public class A014585 extends A014584 {

  private int mN = -1;

  @Override
  public Z next() {
    return mG.get(++mN);
  }
}
