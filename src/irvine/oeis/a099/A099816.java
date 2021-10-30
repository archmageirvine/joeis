package irvine.oeis.a099;
// manually (bisect) 2021-07-05

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A099816 Bisection of A000796 (decimal expansion of Pi).
 * @author Georg Fischer
 */
public class A099816 extends A000796 {

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    return result;
  }
}
