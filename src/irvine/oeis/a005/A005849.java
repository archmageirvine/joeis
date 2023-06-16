package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005849 Indices of prime Cullen numbers: numbers k such that k*2^k + 1 is prime.
 * @author Sean A. Irvine
 */
public class A005849 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z v = mN.shiftLeft(mN.longValueExact()).add(1);
      if (v.isProbablePrime()) {
        return mN;
      }
    }
  }
}
