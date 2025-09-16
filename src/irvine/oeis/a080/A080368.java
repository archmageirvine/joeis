package irvine.oeis.a080;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387775.
 * @author Sean A. Irvine
 */
public class A080368 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    for (final Z p : Jaguar.factor(++mN).toZArray()) {
      if (Functions.GCD.l(p, mN / p.longValue()) == 1) {
        return p;
      }
    }
    return Z.ZERO;
  }
}
