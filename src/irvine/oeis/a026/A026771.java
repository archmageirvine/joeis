package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026771 a(n) = T(2n,n-1), T given by A026769.
 * @author Sean A. Irvine
 */
public class A026771 extends A026769 {

  /** Construct the sequence. */
  public A026771() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 1);
  }
}
