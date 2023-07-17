package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026715 T(2n,n), T given by A026714.
 * @author Sean A. Irvine
 */
public class A026715 extends A026714 {

  /** Construct the sequence. */
  public A026715() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
