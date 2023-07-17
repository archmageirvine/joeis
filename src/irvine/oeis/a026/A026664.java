package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026664 T(2n-1,n-2), T given by A026659.
 * @author Sean A. Irvine
 */
public class A026664 extends A026659 {

  /** Construct the sequence. */
  public A026664() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN - 2);
  }
}
