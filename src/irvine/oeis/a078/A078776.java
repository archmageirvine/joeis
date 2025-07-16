package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078769.
 * @author Sean A. Irvine
 */
public class A078776 extends Sequence1 {

  private long mN = 105;

  @Override
  public Z next() {
    while (true) {
      final long phi = Functions.PHI.l(++mN);
      if (Functions.PHI.l(mN - 1) < phi && phi < Functions.PHI.l(mN + 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}

