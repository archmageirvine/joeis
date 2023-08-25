package irvine.oeis.a291;
// manually robots/union2 at 2023-08-23 09:55

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A291689 Numbers n such that n^2 +- n +- 1 are all composite.
 * @author Georg Fischer
 */
public class A291689 extends Sequence1 {

  private Z mK = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mK = mK.add(1);
      final Z k2 = mK.square();
      if (!k2.add(mK).add(1).isProbablePrime()
        && !k2.add(mK).subtract(1).isProbablePrime()
        && !k2.subtract(mK).add(1).isProbablePrime()
        && !k2.subtract(mK).subtract(1).isProbablePrime()) {
        return mK;
      }
    }
  }
}

