package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026762 a(n) = T(2n-1,n-1), T given by A026758. Also T(2n+1,n+1), T given by A026747.
 * @author Sean A. Irvine
 */
public class A026762 extends A026758 {

  /** Construct the sequence. */
  public A026762() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN - 1);
  }
}
