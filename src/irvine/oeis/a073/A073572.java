package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073565.
 * @author Sean A. Irvine
 */
public class A073572 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long k = 0;
    Z sum = Functions.PHI.z(++mN);
    while (true) {
      sum = sum.add(Functions.PHI.z(mN + ++k));
      if (sum.mod(k + 1) != 0) {
        return Z.valueOf(k - 1);
      }
    }
  }
}
