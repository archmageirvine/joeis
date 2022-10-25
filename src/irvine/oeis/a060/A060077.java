package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060077 Fifth column of triangle A060074.
 * @author Sean A. Irvine
 */
public class A060077 extends A060058 {

  private int mN = -1;

  @Override
  public Z next() {
    return mA.get(++mN + 4, mN);
  }
}
