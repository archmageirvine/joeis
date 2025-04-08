package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076527 Numbers n such that sopf(n) = sopf(n-1) - sopf(n-2), where sopf(x) = sum of the distinct prime factors of x.
 * @author Sean A. Irvine
 */
public class A076527 extends Sequence1 {

  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SOPF.l(++mN) == Functions.SOPF.l(mN - 1) - Functions.SOPF.l(mN - 2)) {
        return Z.valueOf(mN);
      }
    }
  }
}
