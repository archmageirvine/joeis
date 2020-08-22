package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005849 Prime Cullen numbers: numbers n such that n*2^n + 1 is prime.
 * @author Sean A. Irvine
 */
public class A005849 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z v = mN.shiftLeft(mN.intValueExact()).add(1);
      if (v.isProbablePrime()) {
        return mN;
      }
    }
  }
}
