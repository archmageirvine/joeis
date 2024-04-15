package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046524 Number of coverings of Klein bottle with n lists.
 * @author Sean A. Irvine
 */
public class A046524 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z d = Functions.SIGMA0.z(++mN);
    if ((mN & 1) == 0) {
      final FactorSequence fs = Jaguar.factor(mN / 2);
      return d.multiply(3).subtract(fs.sigma0()).add(fs.sigma()).divide2();
    } else {
      return d;
    }
  }
}

