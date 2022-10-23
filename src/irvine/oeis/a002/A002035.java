package irvine.oeis.a002;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002035 Numbers that contain primes to odd powers only.
 * @author Sean A. Irvine
 */
public class A002035 extends Sequence1 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence f = Jaguar.factor(mN);
      boolean ok = true;
      for (final Z z : f.toZArray()) {
        if ((f.getExponent(z) & 1) == 0) {
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

