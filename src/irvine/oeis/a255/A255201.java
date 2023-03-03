package irvine.oeis.a255;
// manually knest/jaguarz at 2023-03-01 16:41

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A255201 Number of prime factors of n^2.
 * @author Georg Fischer
 */
public class A255201 extends A000290 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(super.next()).bigOmega());
  }
}
