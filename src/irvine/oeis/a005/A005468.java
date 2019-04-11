package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005468 <code>a(n) = 1 +</code> a(floor(n/2))*a(ceiling(n/2)).
 * @author Sean A. Irvine
 */
public class A005468 extends A005510 {

  @Override
  protected Z start() {
    return Z.ONE;
  }
}
