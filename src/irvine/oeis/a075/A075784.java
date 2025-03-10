package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075784 Numbers n such that sopf(n) = sopf(n-1) + sopf(n-2) + sopf(n-3), where sopf(x) = sum of the distinct prime factors of x.
 * @author Sean A. Irvine
 */
public class A075784 extends Sequence1 {

  private long mN = 23155;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SOPF.z(++mN).equals(Functions.SOPF.z(mN - 1).add(Functions.SOPF.z(mN - 2)).add(Functions.SOPF.z(mN - 3)))) {
        return Z.valueOf(mN);
      }
    }
  }
}

