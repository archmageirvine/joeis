package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000199 Coefficient of <code>q^(2n-1)</code> in the series expansion of Ramanujan's mock theta function <code>f(q)</code>.
 * @author Sean A. Irvine
 */
public class A000199 extends A000025 {

  @Override
  public Z next() {
    super.next();
    return super.next();
  }
}

