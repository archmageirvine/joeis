package irvine.oeis.a104;
// manually knest/jaguarz at 2023-03-01 16:41

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a001.A001591;

/**
 * A104412 Number of prime factors, with multiplicity, of the pentanacci numbers A001591.
 * @author Georg Fischer
 */
public class A104412 extends A001591 {

  {
    for (int i = 0; i < 4; ++i) {
      super.next();
    }
  }

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(super.next()).bigOmega());
  }
}
