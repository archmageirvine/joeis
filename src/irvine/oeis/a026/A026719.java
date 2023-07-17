package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026719 T(2n-1,n-2), T given by A026714.
 * @author Sean A. Irvine
 */
public class A026719 extends A026714 {

  /** Construct the sequence. */
  public A026719() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN - 2);
  }
}
