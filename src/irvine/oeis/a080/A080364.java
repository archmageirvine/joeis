package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A080364 Composite numbers whose least prime factor appears with multiplicity 1.
 * @author Sean A. Irvine
 */
public class A080364 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final Z lpf = Functions.LPF.z(c);
      if (!c.mod(lpf.square()).isZero()) {
        return c;
      }
    }
  }
}
