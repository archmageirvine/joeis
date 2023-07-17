package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026872 T(2n,n+1), T given by A026758.
 * @author Sean A. Irvine
 */
public class A026872 extends A026758 {

  /** Construct the sequence. */
  public A026872() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN + 1);
  }
}
