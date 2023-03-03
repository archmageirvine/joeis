package irvine.oeis.a352;
// manually knestm/knest at 2023-03-02 16:06

import irvine.math.z.Z;
import irvine.oeis.a051.A051801;

/**
 * A352598 a(n) is the product of the squares of the nonzero digits of n.
 * @author Georg Fischer
 */
public class A352598 extends A051801 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().square();
  }
}
