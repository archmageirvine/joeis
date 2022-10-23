package irvine.oeis.a032;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032758 Undulating primes (digits alternate).
 * @author Sean A. Irvine
 */
public class A032758 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();

  private static boolean isMultidigitPrimeEnd(final long t) {
    return t == 1 || t == 3 || t == 7 || t == 9;
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      for (long k = 0; k <= 9; ++k) {
        for (long j = 0; j <= 9; ++j) {
          if (j != k && (isMultidigitPrimeEnd(j) || isMultidigitPrimeEnd(k))) {
            mA.add(Z.valueOf(10 * k + j));
          }
        }
      }
      mA.add(Z.FIVE);
      return Z.TWO;
    }
    while (true) {
      final Z t = mA.pollFirst();
      if (!Z.FIVE.equals(t)) {
        mA.add(t.multiply(10).add(t.mod(100) / 10));
      }
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
