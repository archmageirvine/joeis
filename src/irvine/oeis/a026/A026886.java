package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026886 T(2n,n+4), T given by A026769.
 * @author Sean A. Irvine
 */
public class A026886 extends A026769 {

  /** Construct the sequence. */
  public A026886() {
    super(4);
  }

  private long mN = 3;

  @Override
  public Z next() {
    return get(2 * ++mN, mN + 4);
  }
}
