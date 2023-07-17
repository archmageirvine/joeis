package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026864 T(2n,n+4), T given by A026747.
 * @author Sean A. Irvine
 */
public class A026864 extends A026747 {

  /** Construct the sequence. */
  public A026864() {
    super(4);
  }

  private long mN = 3;

  @Override
  public Z next() {
    return get(2 * ++mN, mN + 4);
  }
}
