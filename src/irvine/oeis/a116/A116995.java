package irvine.oeis.a116;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A116995 Pentagonal numbers with prime indices.
 * @author Georg Fischer
 */
public class A116995 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return p.multiply(p.multiply(3).subtract(1)).divide2();
  }
}
