package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394352 a(n) is the least positive k such that n and 10^n - k are coprime.
 * @author Sean A. Irvine
 */
public class A394352 extends Sequence1 {

  private long mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    mT = mT.multiply(10);
    long k = 0;
    while (true) {
      if (Functions.GCD.z(mT.subtract(++k), mN).isOne()) {
        return Z.valueOf(k);
      }
    }
  }
}
