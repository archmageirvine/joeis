package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a032.A032350;

/**
 * A046348 Composite palindromes divisible by the sum of their prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046348 extends A032350 {

  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      if (c.mod(Cheetah.factor(c).sopfr()).isZero()) {
        return c;
      }
    }
  }
}
