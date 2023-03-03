package irvine.oeis.a242;
// manually knestm/knest at 2023-03-02 19:24

import irvine.math.z.Z;
import irvine.oeis.a100.A100071;

/**
 * A242172 a(n) = 2^n*binomial((n + 1 + (n mod 2))/2, 1/2).
 * @author Georg Fischer
 */
public class A242172 extends A100071 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
