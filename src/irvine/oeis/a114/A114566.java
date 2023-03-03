package irvine.oeis.a114;
// manually knest/jaguarz at 2023-03-01 16:41

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a083.A083216;

/**
 * A114566 Number of prime factors of A083216(n).
 * @author Georg Fischer
 */
public class A114566 extends A083216 {
  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(super.next()).bigOmega());
  }
}
