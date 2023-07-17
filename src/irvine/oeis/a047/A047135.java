package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047135 a(n) = T(n,n-3), array T as in A047130.
 * @author Sean A. Irvine
 */
public class A047135 extends A047130 {

  /** Construct the sequence. */
  public A047135() {
    super(3);
  }

  private long mN = 2;

  @Override
  public Z next() {
    return get(++mN, mN - 3);
  }
}
