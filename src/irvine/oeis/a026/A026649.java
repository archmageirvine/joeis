package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026649 a(n) = T(2n,n), T given by A026648.
 * @author Sean A. Irvine
 */
public class A026649 extends A026648 {

  /** Construct the sequence. */
  public A026649() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
