package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A082504 Largest k such that the sum of sums of decimal digits of the next k numbers &gt; n does not exceed 10.
 * @author Sean A. Irvine
 */
public class A082504 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = mN;
    long s = 0;
    while (true) {
      final long d = Functions.DIGIT_SUM.l(++k);
      if (d + s > 10) {
        return Z.valueOf(k - mN - 1);
      }
      s += d;
    }
  }
}
