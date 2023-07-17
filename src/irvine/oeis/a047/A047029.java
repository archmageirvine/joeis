package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047029 T(2n,n), array T given by A047020.
 * @author Sean A. Irvine
 */
public class A047029 extends A047020 {

  /** Construct the sequence. */
  public A047029() {
    super(1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
