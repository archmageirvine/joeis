package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026861 T(2n,n+1), T given by A026747.
 * @author Sean A. Irvine
 */
public class A026861 extends A026747 {

  /** Construct the sequence. */
  public A026861() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN + 1);
  }
}
