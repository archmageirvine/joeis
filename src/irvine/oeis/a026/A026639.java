package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026639 a(n) = A026637(2*n, n-1).
 * @author Sean A. Irvine
 */
public class A026639 extends A026637 {

  /** Construct the sequence. */
  public A026639() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 1);
  }
}
