package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028339.
 * @author Sean A. Irvine
 */
public class A028339 extends A028338 {

  private int mN = 1;

  @Override
  public Z next() {
    return get(++mN, 2);
  }
}
