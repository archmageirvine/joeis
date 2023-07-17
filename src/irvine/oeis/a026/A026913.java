package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026913 T(2n-1,n-2), T given by A026907.
 * @author Sean A. Irvine
 */
public class A026913 extends A026907 {

  /** Construct the sequence. */
  public A026913() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return t(2 * ++mN - 1, mN - 2);
  }
}
