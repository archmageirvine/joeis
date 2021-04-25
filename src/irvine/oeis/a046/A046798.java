package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000051;

/**
 * A046798 Number of divisors of 2^n + 1.
 * @author Sean A. Irvine
 */
public class A046798 extends A000051 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma0();
  }
}

