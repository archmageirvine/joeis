package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045769 Numbers k such that sigma(k) == 4 (mod k).
 * @author Sean A. Irvine
 */
public class A045769 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN == 1 || mN == 3 || Jaguar.factor(mN).sigma().mod(mN) == 4) {
        return Z.valueOf(mN);
      }
    }
  }
}
