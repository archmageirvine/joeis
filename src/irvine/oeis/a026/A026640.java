package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026640 a(n) = A026637(2*n, n-2).
 * @author Sean A. Irvine
 */
public class A026640 extends A026637 {

  /** Construct the sequence. */
  public A026640() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 2);
  }
}
