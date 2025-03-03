package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075622 Concatenation of n-th group in A075621 divided by n.
 * @author Sean A. Irvine
 */
public class A075622 extends A075621 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}
