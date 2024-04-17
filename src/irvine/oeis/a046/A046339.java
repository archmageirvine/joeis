package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A046339 Composite numbers with an odd number of prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046339 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if ((Functions.BIG_OMEGA.l(t) & 1) == 1) {
        return t;
      }
    }
  }
}
