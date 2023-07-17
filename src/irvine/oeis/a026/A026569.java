package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026569 a(n) = T(n,n), T given by A026568. Also a(n) = number of integer strings s(0),...,s(n) counted by T, such that s(n)=0.
 * @author Sean A. Irvine
 */
public class A026569 extends A026568 {

  /** Construct the sequence. */
  public A026569() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
