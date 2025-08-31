package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026911 a(n) = A026907(2*n, n-2).
 * @author Sean A. Irvine
 */
public class A026911 extends A026907 {

  /** Construct the sequence. */
  public A026911() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return t(2 * ++mN, mN - 2);
  }
}
