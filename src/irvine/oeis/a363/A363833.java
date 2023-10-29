package irvine.oeis.a363;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000129;

/**
 * A363833 Number of prime factors of A000129(n) (Pell numbers) (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A363833 extends A000129 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(super.next()).bigOmega());
  }
}
