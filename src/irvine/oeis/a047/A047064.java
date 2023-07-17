package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047064 T(n,n-2), array T as in A047060.
 * @author Sean A. Irvine
 */
public class A047064 extends A047060 {

  /** Construct the sequence. */
  public A047064() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(++mN, mN - 2);
  }
}
