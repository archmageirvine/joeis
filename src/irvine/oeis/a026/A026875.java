package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026875 T(2n,n+4), T given by A026758.
 * @author Sean A. Irvine
 */
public class A026875 extends A026758 {

  /** Construct the sequence. */
  public A026875() {
    super(4);
  }

  private long mN = 3;

  @Override
  public Z next() {
    return get(2 * ++mN, mN + 4);
  }
}
