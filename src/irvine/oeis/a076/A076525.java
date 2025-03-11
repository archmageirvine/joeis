package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076525 Numbers n such that sopf(n) = sopf(n+1) - sopf(n-1), where sopf(x) = sum of the distinct prime factors of x.
 * @author Sean A. Irvine
 */
public class A076525 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SOPF.z(++mN + 1).equals(Functions.SOPF.z(mN + 2).subtract(Functions.SOPF.z(mN)))) {
        return Z.valueOf(mN + 1);
      }
    }
  }
}

