package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026616 T(2n,n), T given by A026615.
 * @author Sean A. Irvine
 */
public class A026616 extends A026615 {

  /** Construct the sequence. */
  public A026616() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
