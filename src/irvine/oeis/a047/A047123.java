package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047123 T(n,n-1), array T as in A047120.
 * @author Sean A. Irvine
 */
public class A047123 extends A047120 {

  /** Construct the sequence. */
  public A047123() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, mN - 1);
  }
}
