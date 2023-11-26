package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026866 a(n) = T(2n+1,n+2), T given by A026747.
 * @author Sean A. Irvine
 */
public class A026866 extends A026747 {

  /** Construct the sequence. */
  public A026866() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN + 1, mN + 2);
  }
}
