package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000150 Number of dissections of an <code>n-gon</code>, rooted at an exterior edge, asymmetric with respect to that edge.
 * @author Sean A. Irvine
 */
public class A000150 implements Sequence {

  private final A000108 mC1 = new A000108();
  private final A000108 mC2 = new A000108();
  private boolean mSubtract = true;

  @Override
  public Z next() {
    mSubtract = !mSubtract;
    Z r = mC1.next();
    if (mSubtract) {
      r = r.subtract(mC2.next());
    }
    return r.divide2();
  }
}
