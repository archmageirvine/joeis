package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055677 Smallest k &gt; n where n is a 6th power modulo k.
 * @author Sean A. Irvine
 */
public class A055677 implements Sequence {

  private Z mN = Z.NEG_ONE;

  private boolean isSixthPower(final Z mod, final Z n) {
    for (Z t = Z.ZERO; t.compareTo(mod) < 0; t = t.add(1)) {
      if (t.modPow(Z.SIX, mod).equals(n)) {
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
      if (isSixthPower(k, mN)) {
        return k;
      }
    }
  }
}
