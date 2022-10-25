package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060078 Sixth column of triangle A060074.
 * @author Sean A. Irvine
 */
public class A060078 extends A060058 {

  private int mN = -1;

  @Override
  public Z next() {
    return mA.get(++mN + 5, mN);
  }
}
