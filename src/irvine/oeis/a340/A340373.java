package irvine.oeis.a340;
// manually knest/jaguarz at 2023-03-01 20:54

import irvine.math.z.Z;
import irvine.oeis.a005.A005087;

/**
 * A340373 a(n) = 1 if n is of the form of 2^i * p^j, with p an odd prime, and i&gt;=0, j&gt;=1, otherwise 0.
 * @author Georg Fischer
 */
public class A340373 extends A005087 {
  @Override
  public Z next() {
    return super.next().equals(Z.ONE) ? Z.ONE : Z.ZERO;
  }
}
