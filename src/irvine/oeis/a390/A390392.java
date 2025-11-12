package irvine.oeis.a390;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.InverseSequence;
import irvine.oeis.Sequence1;

/**
 * A390392 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A390392 extends InverseSequence {

  /** Construct the sequence. */
  public A390392() {
    super(1, 1, new Sequence1() {

      private long mK = 0;

      @Override
      public Z next() {
        ++mK;
        long cnt = 0;
        for (final Z dd : Jaguar.factor(mK).divisors()) {
          final long d = dd.longValue();
          final long t = mK - LongUtils.modPow(d, mK / d, mK);
          if (t == d) {
            ++cnt;
          }
        }
        return Z.valueOf(cnt);
      }
    });
  }
}
