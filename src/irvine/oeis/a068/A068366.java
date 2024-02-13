package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061398.
 * @author Sean A. Irvine
 */
public class A068366 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z s = Jaguar.factor(++mN).sigma();
      if (Euler.phi(s.add(mN)).equals(s)) {
        return Z.valueOf(mN);
      }
    }
  }
}

