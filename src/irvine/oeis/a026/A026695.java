package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026695 T(2n,n-2), T given by A026692.
 * @author Sean A. Irvine
 */
public class A026695 extends A026692 {

  /** Construct the sequence. */
  public A026695() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 2);
  }
}
