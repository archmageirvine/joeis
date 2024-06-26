package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069579 Numbers k such that phi(core(k)) = core(phi(k)) where core(k) is the squarefree part of k (the smallest integer such that k*core(k) is a square).
 * @author Sean A. Irvine
 */
public class A069579 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.CORE.l(Functions.PHI.l(++mN)) == Functions.PHI.l(Functions.CORE.l(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
