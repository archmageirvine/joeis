package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047103 T(n,n-1), array T as in A047100.
 * @author Sean A. Irvine
 */
public class A047103 extends A047100 {

  /** Construct the sequence. */
  public A047103() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, mN - 1);
  }
}
