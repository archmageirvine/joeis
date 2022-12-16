package irvine.oeis.a087;
// manually dersimple at 2022-12-15 22:48

import irvine.math.z.Z;
import irvine.oeis.a080.A080677;

/**
 * A087816 a(n) = a(a(n-1)) + a(n - 1 - a(n-1)) with a(1) = a(2) = 1.
 * @author Georg Fischer
 */
public class A087816 extends A080677 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
