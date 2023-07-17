package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047043 T(n,n-1), array T as in A047040; T(n-1,n), array T given by A047050.
 * @author Sean A. Irvine
 */
public class A047043 extends A047040 {

  /** Construct the sequence. */
  public A047043() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, mN - 1);
  }
}
