package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047045 T(n,n-3), array T as in A047040; T(n-3,n), array T given by A047050.
 * @author Sean A. Irvine
 */
public class A047045 extends A047040 {

  /** Construct the sequence. */
  public A047045() {
    super(3);
  }

  private long mN = 2;

  @Override
  public Z next() {
    return get(++mN, mN - 3);
  }
}
