package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026897 T(2n,n+4), T given by A026780.
 * @author Sean A. Irvine
 */
public class A026897 extends A026780 {

  /** Construct the sequence. */
  public A026897() {
    super(4);
  }

  private long mN = 3;

  @Override
  public Z next() {
    return get(2 * ++mN, mN + 4);
  }
}
