package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047104 T(n,n-2), array T as in A047100.
 * @author Sean A. Irvine
 */
public class A047104 extends A047100 {

  /** Construct the sequence. */
  public A047104() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(++mN, mN - 2);
  }
}
