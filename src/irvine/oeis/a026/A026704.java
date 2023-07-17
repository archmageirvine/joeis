package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026704 T(2n,n), T given by A026703.
 * @author Sean A. Irvine
 */
public class A026704 extends A026703 {

  /** Construct the sequence. */
  public A026704() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
