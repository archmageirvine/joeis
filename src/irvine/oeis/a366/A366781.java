package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000073;

/**
 * A366781 Number of prime divisors of A000073(n) (tribonacci numbers) (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A366781 extends A000073 {

  {
    super.next();
    super.next();
    setOffset(2);
  }

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(super.next()).bigOmega());
  }
}
