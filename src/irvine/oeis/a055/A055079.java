package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A055079 Smallest number with exactly n nonprime divisors.
 * @author Sean A. Irvine
 */
public class A055079 extends Sequence1 {

  private final DynamicLongArray mA = new DynamicLongArray();
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) == 0) {
      final FactorSequence fs = Jaguar.factor(++mM);
      final Z t = fs.sigma0().subtract(fs.omega());
      if (t.bitLength() < 32) {
        final int tt = t.intValue();
        if (mA.get(tt) == 0) {
          mA.set(tt, mM);
        }
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}

