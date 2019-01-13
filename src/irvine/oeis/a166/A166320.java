package irvine.oeis.a166;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A166320.
 * @author Sean A. Irvine
 */
public class A166320 implements Sequence {

  private long mN = 142856;
  private long mLimit = 1000000;
  private long mU = 10000;
  private long mInterim = mLimit / 2;

  @Override
  public Z next() {
    while (true) {
      if (++mN > mInterim) {
        mN = mLimit;
        mLimit *= 10;
        mInterim *= 10;
        mU *= 10;
      }
      final long q = (mN / 100) + (mN % 100) * mU;
      if (q != mN && q % mN == 0) {
        return Z.valueOf(mN);
      }
    }
  }

  /**
   * Compute the sequence directly by different faster means.
   *
   * @param args ignored
   */
  public static void main(final String[] args) {
    long u = 10000;
    long v = 100;
    while (true) {
      for (long a = 10 * u; a < 50; ++a) {
        final long au = a * u;
        final long av = a * v;
        for (long b = 2 * a - 1; b < 100; ++b) {
          final long bb = b * u + av;
          for (long y = 0; y < v; ++y) {
            final long d = au + y * 100 + b;
            final long c = bb + y;
            if (c % d == 0) {
              System.out.println(d);
            }
          }
        }
      }
      u *= 10;
      v *= 10;
    }
  }
}

