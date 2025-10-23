package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005422;
import irvine.oeis.a061.A061075;

/**
 * A081318 Integers n such that the reciprocal of the largest prime factor of 10^n-1 is not a repeating decimal fraction with a period of n.
 * @author Sean A. Irvine
 */
public class A081318 extends Sequence1 {

  private final Sequence mA = new A061075();
  private final Sequence mB = new A005422();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (!mA.next().equals(mB.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

