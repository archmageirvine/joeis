package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A070428.
 * @author Sean A. Irvine
 */
public class A075400 extends A075399 {

  private int mN = 0;

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}
