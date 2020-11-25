package irvine.oeis.a215;
// manually 2020-11-25

import irvine.math.z.Z;
import irvine.oeis.a217.A217157;

/**
 * A215236 Greatest integer k such that n^i has no identical consecutive digits for i = 0..k.
 * a(n) = A217157(n) - 1.
 * @author Georg Fischer
 */
public class A215236 extends A217157 {

  @Override
  public Z next() {
    return super.next().subtract(Z.ONE);
  }
}
