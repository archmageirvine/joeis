package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026772 a(n) = T(2n, n-2), T given by A026769.
 * @author Sean A. Irvine
 */
public class A026772 extends A026769 {

  /** Construct the sequence. */
  public A026772() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 2);
  }
}
