package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047044 T(n,n-2), array T as in A047040; T(n-2,n), array T given by A047050.
 * @author Sean A. Irvine
 */
public class A047044 extends A047040 {

  /** Construct the sequence. */
  public A047044() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(++mN, mN - 2);
  }
}
