package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A047973 Distance of n-th prime to nearest cube.
 * @author Sean A. Irvine
 */
public class A047973 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z s = p.root(3);
    return p.subtract(s.pow(3)).min(s.add(1).pow(3).subtract(p));
  }
}
