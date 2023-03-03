package irvine.oeis.a104;
// manually knest/jaguarz at 2023-03-01 16:41

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a079.A079262;

/**
 * A104415 Number of prime factors, with multiplicity, of the nonzero octanacci numbers A079262.
 * @author Georg Fischer
 */
public class A104415 extends A079262 {

  {
    for (int i = 0; i < 7; ++i) {
      super.next();
    }
  }

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(super.next()).bigOmega());
  }
}
