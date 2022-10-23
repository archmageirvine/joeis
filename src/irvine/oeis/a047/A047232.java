package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A047232 Smallest k &gt; n where n is a 4th power modulo k.
 * @author Sean A. Irvine
 */
public class A047232 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  private boolean isFourthPower(final Z mod, final Z n) {
    for (Z t = Z.ZERO; t.compareTo(mod) < 0; t = t.add(1)) {
      if (t.modPow(Z.FOUR, mod).equals(n)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    Z k = mN;
    while (true) {
      k = k.add(1);
      if (isFourthPower(k, mN)) {
        return k;
      }
    }
  }
}
