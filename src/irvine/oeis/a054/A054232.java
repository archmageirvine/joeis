package irvine.oeis.a054;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054232 Number of positive integers &lt;= 2^n of form x^2 + 19 y^2.
 * @author Sean A. Irvine
 */
public class A054232 extends A054150 {

  /** Construct the sequence. */
  public A054232() {
    super(new Sequence0() {
      private long mN = -1;

      @Override
      public Z next() {
        while (true) {
          ++mN;
          for (long s = 0; s * s <= mN; ++s) {
            final long t = mN - s * s;
            if (t % 19 == 0) {
              final long u = t / 19;
              final long v = LongUtils.sqrt(u);
              if (v * v == u) {
                return Z.valueOf(mN);
              }
            }
          }
        }
      }
    });
  }
}
