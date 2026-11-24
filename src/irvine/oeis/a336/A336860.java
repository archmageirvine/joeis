package irvine.oeis.a336;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A336860 a(n) = 1 + the total remainder when repeatedly taking integer square roots until 1 is reached.
 * @author Sean A. Irvine
 */
public class A336860 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    long sum = 1;
    while (m > 1) {
      final long r = Functions.SQRT.l(m);
      sum += m - r * r;
      m = r;
    }
    return Z.valueOf(sum);
  }
}
