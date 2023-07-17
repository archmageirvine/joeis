package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026590 a(n) = T(2*n, n), where T is given by A026584.
 * @author Sean A. Irvine
 */
public class A026590 extends A026584 {

  /** Construct the sequence. */
  public A026590() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
