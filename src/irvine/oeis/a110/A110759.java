package irvine.oeis.a110;
// manually sigman0/sigma0 at 2023-02-28 16:47

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a173.A173426;

/**
 * A110759 a(n) = tau(N), where N = concatenation 1, 2, 3,...,n,..., 3, 2, 1. E.g., for n = 4, N = 1234321.
 * @author Georg Fischer
 */
public class A110759 extends A173426 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma0();
  }
}
