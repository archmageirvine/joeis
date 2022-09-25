package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059430 Cumulative boustrophedon transform of 1, 1, 1, 1, ...
 * @author Sean A. Irvine
 */
public class A059430 extends A059434 {

  private int mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
