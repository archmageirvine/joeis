package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026783 a(n) = T(2n, n-2), T given by A026780.
 * @author Sean A. Irvine
 */
public class A026783 extends A026780 {

  /** Construct the sequence. */
  public A026783() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 2);
  }
}
