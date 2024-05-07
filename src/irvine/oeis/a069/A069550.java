package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069550 Squarefree part of n equals bigomega(n).
 * @author Sean A. Irvine
 */
public class A069550 extends Sequence1 {

  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      if (Functions.CORE.l(++mN) == Functions.BIG_OMEGA.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
