package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392380 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A392380 extends Sequence1 {

  // After Felix Huber

  private int mN = 0;
  private final MemoryFunction1<Z> mB = new MemoryFunction1<Z>() {
    @Override
    protected Z compute(final int n) {
      if (n <= 1) {
        return Z.EIGHT;
      }
      Z k = get(n - 1);
      while (true) {
        k = k.add(1);
        final FactorSequence fs = Jaguar.factor(k);
        final Z[] p = fs.toZArray();
        final long bigOmega = fs.bigOmega();
        if (3 <= bigOmega && p[p.length - 1].multiply2().compareTo(fs.sopfr()) < 0 && (bigOmega != 4 || fs.omega() != 1)) {
          return k;
        }
      }
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN);
  }
}
