package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026684 T(2n,n-2), T given by A026681.
 * @author Sean A. Irvine
 */
public class A026684 extends A026681 {

  /** Construct the sequence. */
  public A026684() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 2);
  }
}
