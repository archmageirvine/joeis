package irvine.oeis.a080;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387775.
 * @author Sean A. Irvine
 */
public class A080367 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z[] p = Jaguar.factor(++mN).toZArray();
    for (int k = p.length - 1; k >= 0; --k) {
      if (Functions.GCD.l(p[k], mN / p[k].longValue()) == 1) {
        return p[k];
      }
    }
    return Z.ZERO;
  }
}
