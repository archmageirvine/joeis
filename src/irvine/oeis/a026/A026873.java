package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026873 T(2n,n+2), T given by A026758.
 * @author Sean A. Irvine
 */
public class A026873 extends A026758 {

  /** Construct the sequence. */
  public A026873() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN + 2);
  }
}
