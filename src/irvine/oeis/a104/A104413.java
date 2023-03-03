package irvine.oeis.a104;
// manually knest/jaguarz at 2023-03-01 16:41

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a001.A001592;

/**
 * A104413 Number of prime factors, with multiplicity, of the hexanacci numbers A001592.
 * @author Georg Fischer
 */
public class A104413 extends A001592 {
  {
    for (int i = 0; i < 5; ++i) {
      super.next();
    }
  }

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(super.next()).bigOmega());
  }
}
