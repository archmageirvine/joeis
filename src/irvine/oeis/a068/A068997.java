package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068997 Numbers n such that Sum_{d|n} d*mu(d) divides n.
 * @author Sean A. Irvine
 */
public class A068997 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = Integers.SINGLETON.sumdiv(++mN, d -> Z.valueOf(d * Functions.MOBIUS.i(d)));
      if (mN % t.longValueExact() == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
