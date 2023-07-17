package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026686 T(2n-1,n-2), T given by A026681.
 * @author Sean A. Irvine
 */
public class A026686 extends A026681 {

  /** Construct the sequence. */
  public A026686() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN - 2);
  }
}
