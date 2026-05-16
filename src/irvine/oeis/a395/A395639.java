package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A395639 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A395639 extends AbstractSequence {

  private long mN = 7;

  /** Construct the sequence. */
  public A395639() {
    super(8);
  }

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    long k = 1;
    while (true) {
      final long f = Functions.FIBONACCI.l(++k);
      final long m = mN - 2 * f * f;
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
