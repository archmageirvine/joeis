package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026782 a(n) = T(2n,n-1), T given by A026780.
 * @author Sean A. Irvine
 */
public class A026782 extends A026780 {

  /** Construct the sequence. */
  public A026782() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 1);
  }
}
