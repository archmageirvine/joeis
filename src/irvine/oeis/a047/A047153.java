package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047153 T(n,n-1), array T as in A047150.
 * @author Sean A. Irvine
 */
public class A047153 extends A047150 {

  /** Construct the sequence. */
  public A047153() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, mN - 1);
  }
}
