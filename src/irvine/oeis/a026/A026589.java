package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026589 a(n) = T(n,n-4), T given by A026584. Also a(n) = number of integer strings s(0),...,s(n) counted by T, such that s(n)=4.
 * @author Sean A. Irvine
 */
public class A026589 extends A026584 {

  /** Construct the sequence. */
  public A026589() {
    super(4);
  }

  private long mN = 3;

  @Override
  public Z next() {
    return get(++mN, mN - 4);
  }
}
