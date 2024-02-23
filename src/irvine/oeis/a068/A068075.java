package irvine.oeis.a068;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068075 Lesser of a primitive pair such that n and its 10's complement are simultaneously square.
 * @author Sean A. Irvine
 */
public class A068075 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.ONE.equals(mN)) {
        return Z.ONE;
      }
      final Z n2 = mN.square();
      if (n2.mod(10) != 0) {
        final CR log = CR.valueOf(n2).log10();
        if (n2.compareTo(Z.TEN.pow(log.floor()).multiply(5)) <= 0
          && Z.TEN.pow(log.add(1).floor()).subtract(n2).isSquare()) {
          return n2;
        }
      }
    }
  }
}
