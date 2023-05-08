package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A063687 Number of 2-trees rooted at any symmetric edge.
 * @author Sean A. Irvine
 */
public class A063690 extends A000040 {

  private long mN = 1;
  private Z mA = super.next().subtract(2);

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      final FactorSequence fs = Jaguar.factor(++mN);
      mA = super.next().subtract(fs.phi().add(fs.sigma0()));
      if (mA.equals(t)) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}

