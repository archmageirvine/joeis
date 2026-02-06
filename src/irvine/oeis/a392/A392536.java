package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A392536 a(n) is the smallest number not yet in the sequence that has a prime factor in common with a(n-2) (either 2 or odd) and an odd prime factor in common with a(n-1); a(1) = 2, a(2) = 6 (see comments for details).
 * @author Sean A. Irvine
 */
public class A392536 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mA = 0;
  private long mB = 0;

  @Override
  public Z next() {
    if (mB == 0) {
      if (mA == 0) {
        mA = 2;
        mUsed.set(2);
        return Z.TWO;
      }
      mB = 6;
      mUsed.set(6);
      return Z.SIX;
    }
    long k = 2;
    while (true) {
      if (!mUsed.isSet(++k)) {
        final long d = Functions.GCD.l(k, mA);
        if (d > 1) {
          final FactorSequence fs = Jaguar.factor(d);
          for (final Z pp : fs.toZArray()) {
            final long p = pp.longValue();
            if (Functions.MAKE_ODD.l(Functions.GCD.l(k / p, mB)) > 1) {
              mUsed.set(k);
              mA = mB;
              mB = k;
              return Z.valueOf(k);
            }
          }
        }
      }
    }
  }
}
