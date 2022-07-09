package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048944 Numbers k such that the product of divisors of k is a cube.
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
      final FactorSequence fs = Jaguar.factor(mN);
      for (final Z p : fs.toZArray()) {
        final int e = fs.getExponent(p) % 3;
        if (e == 2) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

