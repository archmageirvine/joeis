package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicArray;

/**
 * A000669.
 * @author Sean A. Irvine
 */
public class A000669 implements Sequence {

  protected long mN = 0;
  protected final LongDynamicArray<Z> mA = new LongDynamicArray<>();
  protected final LongDynamicArray<Z> mP = new LongDynamicArray<>();

  @Override
  public Z next() {
    if (++mN == 1) {
      mA.set(1, Z.ONE);
      mP.set(1, Z.ONE);
    } else if (mN == 2) {
      mA.set(2, Z.ONE);
      mP.set(2, Z.THREE);
    } else if (mN == 3) {
      mA.set(3, Z.TWO);
      mP.set(3, Z.SEVEN);
    } else {
      final Z n = Z.valueOf(mN);
      final FactorSequence fs = Cheetah.factor(n);
      Z t3 = Z.ZERO;
      for (final Z d : fs.divisors()) {
        if (!d.equals(n)) {
          t3 = t3.add(d.multiply(mA.get(d.longValue())));
        }
      }
      Z ts = Z.ZERO;
      for (long k = 1; k < mN - 1; ++k) {
        ts = ts.add(mP.get(k).multiply(mA.get(mN - k)));
      }
      final Z t4 = t3.add(ts.multiply2()).add(mP.get(mN - 1));
      mA.set(mN, t4.divide(mN));
      mP.set(mN, t3.add(t4));
    }
    return mA.get(mN);
  }
}
