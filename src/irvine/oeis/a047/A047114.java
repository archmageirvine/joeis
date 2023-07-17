package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047114 T(n,n-2), array T as in A047110.
 * @author Sean A. Irvine
 */
public class A047114 extends A047110 {

  /** Construct the sequence. */
  public A047114() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(++mN, mN - 2);
  }
}
