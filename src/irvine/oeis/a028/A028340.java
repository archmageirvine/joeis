package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028340.
 * @author Sean A. Irvine
 */
public class A028340 extends A028338 {

  private int mN = 2;

  @Override
  public Z next() {
    return get(++mN, 3);
  }
}
