package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026576 T(2n,n-2), T given by A026568.
 * @author Sean A. Irvine
 */
public class A026576 extends A026568 {

  /** Construct the sequence. */
  public A026576() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 2);
  }
}
