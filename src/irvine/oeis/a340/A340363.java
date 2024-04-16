package irvine.oeis.a340;
// manually knest/jaguarz at 2023-03-01 16:41

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000265;

/**
 * A340363 a(n) = 1 if n is of the form of 2^i * p^j, with p an odd prime and i, j &gt;= 0, otherwise 0.
 * @author Georg Fischer
 */
public class A340363 extends A000265 {

  @Override
  public Z next() {
    return (Functions.OMEGA.i(super.next()) <= 1) ? Z.ONE : Z.ZERO;
  }
}
