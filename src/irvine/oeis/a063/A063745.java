package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046337.
 * @author Sean A. Irvine
 */
public class A063745 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if ((Jaguar.factor(mN).bigOmega() & 1) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
