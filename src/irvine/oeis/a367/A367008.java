package irvine.oeis.a367;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002064;

/**
 * A367008 Number of prime factors of n*2^n + 1, counted with multiplicity.
 * @author Sean A. Irvine
 */
public class A367008 extends A002064 {

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(super.next()).bigOmega());
  }
}
