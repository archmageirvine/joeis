package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026627 a(n) = A026626(2*n, n).
 * @author Sean A. Irvine
 */
public class A026627 extends A026626 {

  /** Construct the sequence. */
  public A026627() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
