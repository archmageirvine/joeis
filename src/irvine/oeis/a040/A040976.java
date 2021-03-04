package irvine.oeis.a040;
// manually 2021-03-04

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A040976 a(n) = prime(n) - 2.
 * @author Georg Fischer
 */
public class A040976 extends A000040 {

  @Override
  public Z next() {
    return super.next().subtract(Z.TWO);
  }
}
