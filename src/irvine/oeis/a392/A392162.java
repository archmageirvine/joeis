package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A392162 a(n) is the smallest number not yet in the sequence that has exactly one prime factor in common with a(n-1) and has at least two other different prime factors that are not factors of a(n-1); a(1) = 2.
 * @author Sean A. Irvine
 */
public class A392162 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private Z mA = null;

  private boolean is(final long k) {
    if (mUsed.isSet(k)) {
      return false;
    }
    final FactorSequence fs = Jaguar.factor(k);
    if (fs.omega() < 3) {
      return false;
    }
    int cnt = 0;
    for (final Z p : fs.toZArray()) {
      if (mA.mod(p).isZero() && ++cnt > 1) {
        return false;
      }
    }
    return cnt == 1;
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return Z.TWO;
    }
    long k = 29; // 2*3*5-1
    while (true) {
      if (is(++k)) {
        mUsed.set(k);
        mA = Z.valueOf(k);
        return mA;
      }
    }
  }
}

