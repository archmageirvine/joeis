package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a004.A004394;

/**
 * A007668 phi(n) divides <code>sigma(n)</code> and <code>sigma(n)/n &gt;</code> sigma(m)/m for all m <code>&lt; n</code>.
 * @author Sean A. Irvine
 */
public class A007668 extends A004394 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      final FactorSequence fs = Cheetah.factor(a);
      if (Z.ZERO.equals(fs.sigma().mod(fs.phi()))) {
        return a;
      }
    }
  }
}
