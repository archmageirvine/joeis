package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a047.A047845;

/**
 * A065884 a(n) = A065824(A047845(n+1)).
 * @author Sean A. Irvine
 */
public class A065884 extends A047845 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z n = super.next();
    final Z n1 = n.add(1);
    long m = 0;
    while (true) {
      final FactorSequence fs = Jaguar.factor(++m);
      if (fs.phi().multiply(n1).equals(fs.sigma().multiply(n))) {
        return Z.valueOf(m);
      }
    }
  }
}
