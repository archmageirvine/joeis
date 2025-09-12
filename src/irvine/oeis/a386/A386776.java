package irvine.oeis.a386;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A386776 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A386776 extends Sequence1 {

  // umber of divisors d of n such that d^d == d^n (mod n).

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long cnt = 0;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      if (d.modPow(d, mN).equals(d.modPow(mN, mN))) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

