package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026894 T(2n,n+1), T given by A026780.
 * @author Sean A. Irvine
 */
public class A026894 extends A026780 {

  /** Construct the sequence. */
  public A026894() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN + 1);
  }
}
