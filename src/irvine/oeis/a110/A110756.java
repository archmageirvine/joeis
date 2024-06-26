package irvine.oeis.a110;
// Generated by gen_seq4.pl sigman0/sigma0 at 2023-02-28 16:47

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a007.A007908;

/**
 * A110756 a(n) = tau(N), where N = concatenation 1,2,3,...,n.
 * @author Georg Fischer
 */
public class A110756 extends A007908 {

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next());
  }
}
