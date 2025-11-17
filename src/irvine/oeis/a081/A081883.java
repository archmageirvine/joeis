package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a068.A068119;

/**
 * A081883 Numbers n such that the number of steps needed to reach an integer starting with n-1/4 or n+1/4 and iterating the map x--&gt;x*ceiling(x) is the same.
 * @author Sean A. Irvine
 */
public class A081883 extends Sequence1 {

  private final Sequence mA = new A068119().skip();
  private final Sequence mB = new A081882();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mA.next().equals(mB.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
