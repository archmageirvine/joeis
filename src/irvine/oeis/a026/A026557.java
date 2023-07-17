package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026557 a(n) = T(n, n-4), T given by A026552. Also a(n) = number of integer strings s(0),...,s(n) counted by T, such that s(n)=4.
 * @author Sean A. Irvine
 */
public class A026557 extends A026552 {

  /** Construct the sequence. */
  public A026557() {
    super(4);
  }

  private long mN = 3;

  @Override
  public Z next() {
    return get(++mN, mN - 4);
  }
}
