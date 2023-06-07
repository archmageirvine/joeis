package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A064015 Numbers k such that sopf(k)*nud(k) = pi(k), where sopf(k)=A008472, nud(k)=A034444 and pi(k)=A000720.
 * @author Sean A. Irvine
 */
public class A064015 extends A000720 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (super.next().equals(fs.unitarySigma0().multiply(fs.sopf()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
