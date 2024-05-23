package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a004.A004394;

/**
 * A007668 Numbers k such that phi(k) divides sigma(k) and sigma(k)/k &gt; sigma(m)/m for all m &lt; k.
 * @author Sean A. Irvine
 */
public class A007668 extends A004394 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      final FactorSequence fs = Jaguar.factor(a);
      if (fs.sigma().mod(fs.phi()).isZero()) {
        return a;
      }
    }
  }
}
