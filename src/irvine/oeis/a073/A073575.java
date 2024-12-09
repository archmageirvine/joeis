package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073565.
 * @author Sean A. Irvine
 */
public class A073575 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    long k = 0;
    while (true) {
      final long f = Functions.FACTORIAL.l(++k);
      if (f > mN) {
        return sum;
      }
      if (mN % f == 0) {
        sum = sum.add(f);
      }
    }
  }
}
