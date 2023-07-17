package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026895 T(2n,n+2), T given by A026780.
 * @author Sean A. Irvine
 */
public class A026895 extends A026780 {

  /** Construct the sequence. */
  public A026895() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN + 2);
  }
}
