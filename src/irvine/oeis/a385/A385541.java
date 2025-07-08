package irvine.oeis.a385;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A385541 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A385541 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long cnt = 0;
    for (Z d : Jaguar.factor(mN).divisors()) {
      final Z dn = d.mod(mN);
      if (d.modPow(d, mN).equals(dn) && mN.subtract(d).modPow(d, mN).equals(dn)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

