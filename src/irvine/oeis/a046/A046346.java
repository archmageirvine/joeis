package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A046346 Composite numbers that are divisible by the sum of their prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046346 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      if (c.mod(Functions.SOPFR.z(c)).isZero()) {
        return c;
      }
    }
  }
}
