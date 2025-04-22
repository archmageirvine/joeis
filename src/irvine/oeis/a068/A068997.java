package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068997 Numbers k such that Sum_{d|k} d*mu(d) divides k.
 * @author Sean A. Irvine
 */
public class A068997 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = Integers.SINGLETON.sumdiv(++mN, d -> Z.valueOf((long) d * Functions.MOBIUS.i(d)));
      if (mN % t.longValueExact() == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
