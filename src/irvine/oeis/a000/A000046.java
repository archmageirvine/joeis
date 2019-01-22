package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.math.Mobius;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicArray;

/**
 * A000046.
 * @author Sean A. Irvine
 */
public class A000046 implements Sequence {

  private long mN = -1;
  private final LongDynamicArray<Z> mA11Cache = new LongDynamicArray<>();
  private final Sequence mA11 = new A000011();

  private Z a11(final long v) {
    while (mA11Cache.length() <= v) {
      mA11Cache.set(mA11Cache.length(), mA11.next());
    }
    return mA11Cache.get(v);
  }


  @Override
  public Z next() {
    if (++mN < 4) {
      return Z.ONE;
    }
    final FactorSequence fs = Cheetah.factor(mN);
    Z sum = a11(mN);
    for (final Z d : fs.divisors()) {
      final long dd = d.longValue();
      if (dd == 1) {
        continue;
      }
      sum = ZUtils.mobiusAdd(Mobius.mobius(dd), sum, a11(mN / dd));
    }
    return sum;
  }

}

