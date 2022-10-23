package irvine.oeis.a000;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000469 1 together with products of 2 or more distinct primes.
 * @author Sean A. Irvine
 */
public class A000469 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Jaguar.factor(mN);
      final Z[] z = fs.toZArray();
      if (z.length == 1) {
        if (Z.ONE.equals(mN)) {
          return Z.ONE;
        }
      } else {
        boolean ok = true;
        for (final Z v : z) {
          if (fs.getExponent(v) >= 2) {
            ok = false;
            break;
          }
        }
        if (ok) {
          return mN;
        }
      }
    }
  }
}
