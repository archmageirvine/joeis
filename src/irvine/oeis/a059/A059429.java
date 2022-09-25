package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059429 Cumulative boustrophedon transform of 1, 0, 0, 0, ...
 * @author Sean A. Irvine
 */
public class A059429 extends A059432 {

  private int mN = 0;

  @Override
  public Z next() {
    return get(++mN, 1);
  }
}
