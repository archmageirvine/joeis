package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075846 Numbers k such that sopf(k) = (1/2)*(sopf(k+1) + sopf(k-1)), where sopf(x) = sum of the distinct prime factors of x.
 * @author Sean A. Irvine
 */
public class A075846 extends Sequence1 {

  private long mN = 8;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SOPF.z(++mN + 1).multiply2().equals(Functions.SOPF.z(mN).add(Functions.SOPF.z(mN + 2)))) {
        return Z.valueOf(mN + 1);
      }
    }
  }
}

