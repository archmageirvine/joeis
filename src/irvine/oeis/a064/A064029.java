package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064029 Numbers k such that sopfr(k) = ud(k), where sopfr = A001414 and ud = A034444.
 * @author Sean A. Irvine
 */
public class A064029 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sopfr().equals(fs.unitarySigma0())) {
        return Z.valueOf(mN);
      }
    }
  }
}
