package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002805;
import irvine.oeis.a007.A007409;

/**
 * A068545.
 * @author Sean A. Irvine
 */
public class A068585 extends Sequence1 {

  private final Sequence mA = new A002805();
  private final Sequence mB = new A007409();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mA.next().pow(3).equals(mB.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
