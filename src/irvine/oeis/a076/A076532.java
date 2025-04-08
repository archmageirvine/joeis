package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076532 Numbers n such that sopf(sigma(n)) = sigma(sopf(n)), where sopf(x) = sum of the distinct prime factors of x.
 * @author Sean A. Irvine
 */
public class A076532 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SOPF.z(Functions.SIGMA1.z(++mN)).equals(Functions.SIGMA1.z(Functions.SOPF.z(mN)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
