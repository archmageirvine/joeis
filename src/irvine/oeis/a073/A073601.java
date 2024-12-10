package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073565.
 * @author Sean A. Irvine
 */
public class A073601 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final int d = Functions.LEADING_DIGIT.i(++mN);
    Z t = Z.valueOf(mN);
    long k = 1;
    while (true) {
      ++k;
      t = t.multiply(mN);
      if (Functions.LEADING_DIGIT.i(t) == d) {
        return Z.valueOf(k);
      }
    }
  }
}
