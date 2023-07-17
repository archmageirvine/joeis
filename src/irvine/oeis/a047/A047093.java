package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047093 T(n,n-2), array T as in A047089.
 * @author Sean A. Irvine
 */
public class A047093 extends A047089 {

  /** Construct the sequence. */
  public A047093() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN - 2, mN);
  }
}
