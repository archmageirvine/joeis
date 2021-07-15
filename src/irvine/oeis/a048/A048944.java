package irvine.oeis.a048;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048944 Product of divisors of n is a cube.
 * @author Sean A. Irvine
 */
public class A048944 implements Sequence {

  private long mN = 0;
  private long mC = 1;
  private long mNextCube = 1;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mNextCube) {
        mNextCube = ++mC * mC * mC;
        return Z.valueOf(mN);
      }
      final FactorSequence fs = Cheetah.factor(mN);
      for (final Z p : fs.toZArray()) {
        final int e = fs.getExponent(p) % 3;
        if (e == 2) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

