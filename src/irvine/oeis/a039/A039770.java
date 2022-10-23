package irvine.oeis.a039;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039770 Numbers k such that phi(k) is a perfect square.
 * @author Sean A. Irvine
 */
public class A039770 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).phi().isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
