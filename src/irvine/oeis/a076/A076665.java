package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076585.
 * @author Sean A. Irvine
 */
public class A076665 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.PHI.l(++mN) + Functions.PHI.l(mN + 3) == Functions.PHI.l(mN + 1) + Functions.PHI.l(mN + 2)) {
        return Z.valueOf(mN);
      }
    }
  }
}
