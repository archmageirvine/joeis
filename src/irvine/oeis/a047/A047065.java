package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047065 T(n,n-3), array T as in A047060.
 * @author Sean A. Irvine
 */
public class A047065 extends A047060 {

  /** Construct the sequence. */
  public A047065() {
    super(3);
  }

  private long mN = 2;

  @Override
  public Z next() {
    return get(++mN, mN - 3);
  }
}
