package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002805;
import irvine.oeis.a007.A007407;

/**
 * A068584 Numbers k such that the denominator of (Sum_{j=1..k} 1/j)^2 equals the denominator of Sum_{j=1..k} 1/j^2.
 * @author Sean A. Irvine
 */
public class A068584 extends Sequence1 {

  private final Sequence mA = new A002805();
  private final Sequence mB = new A007407();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mA.next().square().equals(mB.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
