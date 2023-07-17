package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026878 a(n) = T(2n+1,n+3), T given by A026758.
 * @author Sean A. Irvine
 */
public class A026878 extends A026758 {

  /** Construct the sequence. */
  public A026878() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN + 1, mN + 3);
  }
}
