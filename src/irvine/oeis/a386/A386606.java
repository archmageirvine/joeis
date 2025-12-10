package irvine.oeis.a386;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A386606 Numbers with exactly 3 distinct odd prime factors.
 * @author Sean A. Irvine
 */
public class A386606 extends Sequence1 {

  private long mN = 104;

  @Override
  public Z next() {
    while (true) {
      if (Functions.OMEGA.i(Functions.MAKE_ODD.l(++mN)) == 3) {
        return Z.valueOf(mN);
      }
    }
  }
}
