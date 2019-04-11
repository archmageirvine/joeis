package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A003047 <code>a(n) =</code> Catalan(n) * Product <code>a(k), k = 0 . . n-1</code>.
 * @author Sean A. Irvine
 */
public class A003047 extends A000108 {

  private Z mP = Z.ONE;

  @Override
  public Z next() {
    final Z a = mP.multiply(super.next());
    mP = mP.multiply(a);
    return a;
  }
}
