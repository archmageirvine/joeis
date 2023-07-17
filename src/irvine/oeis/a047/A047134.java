package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047134 T(n,n-2), array T as in A047130.
 * @author Sean A. Irvine
 */
public class A047134 extends A047130 {

  /** Construct the sequence. */
  public A047134() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(++mN, mN - 2);
  }
}
