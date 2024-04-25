package irvine.oeis.a069;

import irvine.math.z.Z;

/**
 * A069295.
 * @author Sean A. Irvine
 */
public class A069303 extends A069295 {

  private int mN = 1;

  @Override
  public Z next() {
    return count(++mN, 12);
  }
}
