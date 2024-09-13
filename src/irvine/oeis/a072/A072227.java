package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072227 Numbers n such that reverse(d) divides reverse(n) for all divisors d of n.
 * @author Sean A. Irvine
 */
public class A072227 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    final long r = Functions.REVERSE.l(n);
    for (final Z d : Jaguar.factor(n).divisors()) {
      if (r % Functions.REVERSE.l(d) != 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
