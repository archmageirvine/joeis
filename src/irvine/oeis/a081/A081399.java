package irvine.oeis.a081;
// manually knest/jaguarz at 2023-03-01 16:41

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A081399 Bigomega of the n-th Catalan number: a(n) = A001222(A000108(n)).
 * @author Georg Fischer
 */
public class A081399 extends A000108 {
  @Override
  public Z next() {
    return Functions.BIG_OMEGA.z(super.next());
  }
}
