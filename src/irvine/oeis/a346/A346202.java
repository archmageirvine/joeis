package irvine.oeis.a346;
// manually dersimple at 2022-12-15 22:48

import irvine.math.z.Z;
import irvine.oeis.a002.A002819;

/**
 * A346202 a(n) = L(n)^2, where L is Liouville's function.
 * @author Georg Fischer
 */
public class A346202 extends A002819 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().square();
  }
}
