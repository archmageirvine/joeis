package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026868 T(2n+1,n+4), T given by A026747.
 * @author Sean A. Irvine
 */
public class A026868 extends A026747 {

  /** Construct the sequence. */
  public A026868() {
    super(3);
  }

  private long mN = 2;

  @Override
  public Z next() {
    return get(2 * ++mN + 1, mN + 4);
  }
}
