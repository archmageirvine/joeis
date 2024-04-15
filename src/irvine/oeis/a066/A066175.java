package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066175 Numbers k such that sigma(phi(sigma(k))) = k.
 * @author Sean A. Irvine
 */
public class A066175 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (Functions.SIGMA.z(Euler.phi(Jaguar.factor(n).sigma())).equals(n)) {
        return n;
      }
    }
  }
}
