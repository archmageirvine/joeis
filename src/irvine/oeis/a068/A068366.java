package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068366 Numbers k such that phi(sigma(k)+k) = sigma(k).
 * @author Sean A. Irvine
 */
public class A068366 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z s = Functions.SIGMA.z(++mN);
      if (Euler.phi(s.add(mN)).equals(s)) {
        return Z.valueOf(mN);
      }
    }
  }
}

