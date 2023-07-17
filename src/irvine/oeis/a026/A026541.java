package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026541 a(n) = T(n,n-4), T given by A026536. Also a(n) = number of integer strings s(0), ..., s(n), counted by T, such that s(n) = 4.
 * @author Sean A. Irvine
 */
public class A026541 extends A026536 {

  /** Construct the sequence. */
  public A026541() {
    super(4);
  }

  private long mN = 3;

  @Override
  public Z next() {
    return get(++mN, mN - 4);
  }
}
