package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026522 a(n) = T(n, n-2), where T is given by A026519. Also number of integer strings s(0), ..., s(n), counted by T, such that s(n) = 2.
 * @author Sean A. Irvine
 */
public class A026522 extends A026519 {

  /** Construct the sequence. */
  public A026522() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(++mN, mN - 2);
  }
}
