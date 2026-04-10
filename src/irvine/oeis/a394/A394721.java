package irvine.oeis.a394;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394721 allocated for Leo Hennig.
 * @author Sean A. Irvine
 */
public class A394721 extends Sequence1 {

  private long mN = 5;

  private boolean is(final long n, final Z[] d, final int pos) {
    if (n == 0) {
      return pos <= 0;
    }
    if (pos <= 0) {
      return false;
    }
    for (long k = 1, s; (s = n - d[pos].pow(k).longValueExact()) >= 0; ++k) {
      if (is(s, d, pos - 1)) {
        return true;
      }
    }
    return false;
  }

  private boolean is(final long n) {
    final Z[] d = Jaguar.factor(n).divisorsSorted();
    return is(n - 1, d, d.length - 2); // -1 to handle divisor 1
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
