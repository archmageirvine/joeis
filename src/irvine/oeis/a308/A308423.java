package irvine.oeis.a308;
// Generated by gen_seq4.pl knest at 2023-03-02 20:46

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a007.A007691;

/**
 * A308423 Product of divisors of multiply-perfect numbers.
 * @author Georg Fischer
 */
public class A308423 extends A007691 {
  @Override
  public Z next() {
    return Jaguar.factor(super.next()).pod();
  }
}
