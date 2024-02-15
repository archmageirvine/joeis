package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A068405 Numbers k such that (k+1) is squarefree and composite and such that there is one more distinct prime factor in k than in (k+1).
 * @author Sean A. Irvine
 */
public class A068405 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z k1 = super.next();
      final FactorSequence fs1 = Jaguar.factor(k1);
      if (fs1.isSquareFree()) {
        final Z k = k1.subtract(1);
        if (Jaguar.factor(k).omega() == fs1.omega() + 1) {
          return k;
        }
      }
    }
  }
}

