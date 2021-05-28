package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A047972 Distance of n-th prime to nearest square.
 * @author Sean A. Irvine
 */
public class A047972 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z s = p.sqrt();
    return p.subtract(s.square()).min(s.add(1).square().subtract(p));
  }
}
