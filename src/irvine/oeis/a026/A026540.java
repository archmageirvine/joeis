package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026540 a(n) = T(n,n-3), T given by A026536. Also number of integer strings s(0), ..., s(n), counted by T, such that s(n) = 3.
 * @author Sean A. Irvine
 */
public class A026540 extends A026536 {

  /** Construct the sequence. */
  public A026540() {
    super(3);
  }

  private long mN = 2;

  @Override
  public Z next() {
    return get(++mN, mN - 3);
  }
}
