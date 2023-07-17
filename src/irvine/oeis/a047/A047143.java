package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047143 T(n,n-1), array T as in A047140.
 * @author Sean A. Irvine
 */
public class A047143 extends A047140 {

  /** Construct the sequence. */
  public A047143() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, mN - 1);
  }
}
