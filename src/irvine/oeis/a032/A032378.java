package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032378 Noncubes k that are divisible by floor(k^(1/3)).
 * @author Sean A. Irvine
 */
public class A032378 extends Sequence1 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z r = mN.root(3);
      if (mN.auxiliary() == 0 && mN.mod(r).isZero()) {
        return mN;
      }
    }
  }
}
