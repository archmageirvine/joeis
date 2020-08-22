package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032378 Noncubes such that n is divisible by floor(n^(1/3)).
 * @author Sean A. Irvine
 */
public class A032378 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z r = mN.root(3);
      if (mN.auxiliary() == 0 && Z.ZERO.equals(mN.mod(r))) {
        return mN;
      }
    }
  }
}
