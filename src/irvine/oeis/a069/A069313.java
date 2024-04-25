package irvine.oeis.a069;

import irvine.math.z.Z;

/**
 * A069295.
 * @author Sean A. Irvine
 */
public class A069313 extends A069295 {

  private int mN = 1;

  @Override
  public Z next() {
    return count(9, ++mN);
  }
}
