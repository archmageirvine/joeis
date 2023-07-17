package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026639 T(2n,n-1), T given by A026637.
 * @author Sean A. Irvine
 */
public class A026639 extends A026637 {

  /** Construct the sequence. */
  public A026639() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 1);
  }
}
