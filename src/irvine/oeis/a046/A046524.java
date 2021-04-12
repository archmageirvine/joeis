package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046524 Number of coverings of Klein bottle with n lists.
 * @author Sean A. Irvine
 */
public class A046524 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final Z d = Cheetah.factor(++mN).sigma0();
    if ((mN & 1) == 0) {
      final FactorSequence fs = Cheetah.factor(mN / 2);
      return d.multiply(3).subtract(fs.sigma0()).add(fs.sigma()).divide2();
    } else {
      return d;
    }
  }
}

