package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a018.A018804;

/**
 * A080999 Centrality of A080997(n) = a(n)/(A080997(n))^2.
 * @author Sean A. Irvine
 */
public class A080999 extends A080997 {

  private final A018804 mA018804 = new A018804();

  @Override
  public Z next() {
    return mA018804.a(super.next());
  }
}

