package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026592 a(n) = T(2*n, n-2), where T is given by A026584.
 * @author Sean A. Irvine
 */
public class A026592 extends A026584 {

  /** Construct the sequence. */
  public A026592() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 2);
  }
}
