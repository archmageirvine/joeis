package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073655.
 * @author Sean A. Irvine
 */
public class A073881 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long t = Functions.PRIME_PI.l(++mN) * 2;
    long k = mN;
    while (Functions.PRIME_PI.l(k) != t) {
      ++k;
    }
    return Z.valueOf(k);
  }
}
