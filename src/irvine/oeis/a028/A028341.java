package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028341.
 * @author Sean A. Irvine
 */
public class A028341 extends A028338 {

  private int mN = 3;

  @Override
  public Z next() {
    return get(++mN, 4);
  }
}
