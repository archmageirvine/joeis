package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000010;
import irvine.oeis.a000.A000720;

/**
 * A067786 Numbers n such that phi(n) = 2*pi(n) where pi(n) = A000720(n) and phi(n) = A000010(n).
 * @author Sean A. Irvine
 */
public class A067786 extends Sequence1 {

  private long mN = 0;
  private final Sequence mPi = new A000720();
  private final Sequence mPhi = new A000010();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mPhi.next().equals(mPi.next().multiply2())) {
        return Z.valueOf(mN);
      }
    }
  }
}
