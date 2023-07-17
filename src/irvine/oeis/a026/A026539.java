package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026539 a(n) = T(n,n-2), T given by A026536. Also a(n) = number of integer strings s(0), ..., s(n), counted by T, such that s(n) = 2.
 * @author Sean A. Irvine
 */
public class A026539 extends A026536 {

  /** Construct the sequence. */
  public A026539() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(++mN, mN - 2);
  }
}
