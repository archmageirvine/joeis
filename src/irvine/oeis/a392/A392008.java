package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392008 allocated for Charles Kusniec.
 * @author Sean A. Irvine
 */
public class A392008 extends Sequence1 {

  private long mN = 103;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final long omega = Functions.OMEGA.l(mN);
      if (omega >= 3 && Functions.BIG_OMEGA.l(mN) == omega) {
        return Z.valueOf(mN);
      }
    }
  }
}
