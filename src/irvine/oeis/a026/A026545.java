package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026545 a(n) = T(2n-1, n-1), T given by A026536.
 * @author Sean A. Irvine
 */
public class A026545 extends A026536 {

  /** Construct the sequence. */
  public A026545() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN - 1);
  }
}
