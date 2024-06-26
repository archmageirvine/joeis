package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067019 Odd numbers with an odd number of prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A067019 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if ((Functions.BIG_OMEGA.l(mN) & 1) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
