package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.a068.A068620;

/**
 * A053548 Number of ternary Lyndon words of length n with trace 0 and subtrace 0 over GF(3).
 * @author Sean A. Irvine
 */
public class A074403 extends A068620 {

  private final int mTrace;
  private final int mSubtrace;
  private int mN = 0;

  protected A074403(final int trace, final int subtrace) {
    mTrace = trace;
    mSubtrace = subtrace;
  }

  /** Construct the sequence. */
  public A074403() {
    this(0, 1);
  }

  private Z l(final int n, final int t, final int s) {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final int d = dd.intValue();
      if ((d & 1) == 1) {
        final int mu = Mobius.mobius(d);
        if (mu != 0) {
          switch (d & 7) {
            case 1: // j = 0
              sum = sum.signedAdd(mu == 1, mS.get(n / d, t, s));
              break;
            case 3: // j = 1
              sum = sum.signedAdd(mu == 1, mS.get(n / d, 4 - t, (4 - (t * t + s) % 4) % 4));
              break;
            case 5: // j = 2
              sum = sum.signedAdd(mu == 1, mS.get(n / d, t, (4 + s - (2 * t * t) % 4) % 4));
              break;
            case 7: // j = 3
              sum = sum.signedAdd(mu == 1, mS.get(n / d, 4 - t, (4 - (3 * t * t + s) % 4) % 4));
              break;
            default:
              throw new RuntimeException();
          }
        }
      }
    }
    return sum.divide(n);
  }

  @Override
  public Z next() {
    return l(++mN, mTrace, mSubtrace);
  }
}
