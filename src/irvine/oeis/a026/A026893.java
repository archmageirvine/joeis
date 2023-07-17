package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026893 T(2n,n-3), T given by A026780.
 * @author Sean A. Irvine
 */
public class A026893 extends A026780 {

  /** Construct the sequence. */
  public A026893() {
    super(3);
  }

  private long mN = 2;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 3);
  }
}
