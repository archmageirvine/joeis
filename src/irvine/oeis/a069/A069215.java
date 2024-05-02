package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069215 Numbers n such that phi(n) = reversal(n).
 * @author Sean A. Irvine
 */
public class A069215 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.PHI.l(++mN) == Functions.REVERSE.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

