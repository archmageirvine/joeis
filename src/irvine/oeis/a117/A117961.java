package irvine.oeis.a117;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A117961 Hexagonal numbers with prime indices.
 * @author Georg Fischer
 */
public class A117961 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return p.multiply(p.multiply2().subtract(1));
  }
}
