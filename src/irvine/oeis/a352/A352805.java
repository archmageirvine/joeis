package irvine.oeis.a352;
// manually knestm/knest at 2023-03-02 19:24

import irvine.math.z.Z;
import irvine.oeis.a296.A296507;

/**
 * A352805 a(n) = A296507(n+1)/6; numbers k such that 36*k^2 - 13 is prime.
 * @author Georg Fischer
 */
public class A352805 extends A296507 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(6);
  }
}
