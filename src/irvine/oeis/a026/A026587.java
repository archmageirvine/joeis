package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026587 a(n) = T(n, n-2), T given by A026584. Also a(n) = number of integer strings s(0),...,s(n) counted by T, such that s(n)=2.
 * @author Sean A. Irvine
 */
public class A026587 extends A026584 {

  /** Construct the sequence. */
  public A026587() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(++mN, mN - 2);
  }
}
