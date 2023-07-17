package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026572 a(n) = T(n,n-3), T given by A026568. Also a(n) = number of integer strings s(0),...,s(n) counted by T, such that s(n)=3.
 * @author Sean A. Irvine
 */
public class A026572 extends A026568 {

  /** Construct the sequence. */
  public A026572() {
    super(3);
  }

  private long mN = 2;

  @Override
  public Z next() {
    return get(++mN, mN - 3);
  }
}
