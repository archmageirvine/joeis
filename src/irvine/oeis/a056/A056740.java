package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056740 Odd solutions x to 2^x mod x = 2^(x+2) mod (x-2).
 * @author Sean A. Irvine
 */
public class A056740 implements Sequence {

  private Z mN = Z.valueOf(133);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      final Z m = Z.TWO.modPow(mN, mN);
      if (m.isOdd() && m.equals(Z.TWO.modPow(mN.add(2), mN.subtract(2)))) {
        return mN;
      }
    }
  }
}
