package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026631 a(n) = A026626(2*n-1, n-2).
 * @author Sean A. Irvine
 */
public class A026631 extends A026626 {

  /** Construct the sequence. */
  public A026631() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN - 2);
  }
}
