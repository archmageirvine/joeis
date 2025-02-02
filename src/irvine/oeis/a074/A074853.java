package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074853 Numbers n not in A065036 but such that tau(n)=omega(n)^3.
 * @author Sean A. Irvine
 */
public class A074853 extends Sequence1 {

  private long mN = 899;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma0().equals(Z.valueOf(fs.omega()).pow(3))) {
        final Z[] p = fs.toZArray();
        if (p.length == 2 && (
          (fs.getExponent(p[0]) == 1 && fs.getExponent(p[1]) == 3)
            || (fs.getExponent(p[1]) == 1 && fs.getExponent(p[0]) == 3))) {
          continue;
        }
        return Z.valueOf(mN);
      }
    }
  }
}
