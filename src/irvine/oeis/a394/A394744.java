package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A394744 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A394744 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    long k = 1;
    while (true) {
      final long f = Functions.FIBONACCI.l(++k);
      final long m = mN - f * f;
      if (m <= 1) {
        break;
      }
      long j = 1;
      while (true) {
        if (++j == k) {
          continue;
        }
        final long g = Functions.FIBONACCI.l(j);
        if (g * g >= m) {
          break;
        }
        if (m % g == 0) {
          final long r = m / g;
          if (r != f && Predicates.FIBONACCI.is(r)) {
            ++cnt;
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
