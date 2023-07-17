package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047033 T(n,n-1), array T as in A047030.
 * @author Sean A. Irvine
 */
public class A047033 extends A047030 {

  /** Construct the sequence. */
  public A047033() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, mN - 1);
  }
}
