package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075651 Row average values of A075652.
 * @author Sean A. Irvine
 */
public class A075651 extends A075650 {

  private int mN = 0;

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}
