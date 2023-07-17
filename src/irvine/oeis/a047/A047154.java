package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047154 T(n,n-2), array T as in A047150.
 * @author Sean A. Irvine
 */
public class A047154 extends A047150 {

  /** Construct the sequence. */
  public A047154() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(++mN, mN - 2);
  }
}
