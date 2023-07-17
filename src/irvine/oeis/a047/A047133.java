package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047133 T(n,n-1), array T as in A047130.
 * @author Sean A. Irvine
 */
public class A047133 extends A047130 {

  /** Construct the sequence. */
  public A047133() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, mN - 1);
  }
}
