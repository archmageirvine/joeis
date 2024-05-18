package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A069737 Integer quotient defining A068418 is 3.
 * @author Sean A. Irvine
 */
public class A069737 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z k = super.next();
      final FactorSequence fs = Jaguar.factor(k);
      final Z[] qr = fs.sigma().subtract(k).divideAndRemainder(k.subtract(fs.phi()));
      if (qr[1].isZero() && Z.THREE.equals(qr[0])) {
        return k;
      }
    }
  }
}

