package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077656 Numbers having a different number of prime factors as their successors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A077656 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.BIG_OMEGA.l(++mN) != Functions.BIG_OMEGA.l(mN + 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
