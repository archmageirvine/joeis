package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026892 T(2n,n-4), T given by A026780.
 * @author Sean A. Irvine
 */
public class A026892 extends A026780 {

  /** Construct the sequence. */
  public A026892() {
    super(4);
  }

  private long mN = 3;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 4);
  }
}
