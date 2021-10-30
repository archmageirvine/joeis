package irvine.oeis.a099;
// manually (bisect) 2021-07-05

import irvine.math.z.Z;
import irvine.oeis.a007.A007088;

/**
 * A099820 Even nonnegative integers in base 2 (bisection of A007088).
 * @author Georg Fischer
 */
public class A099820 extends A007088 {

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    return result;
  }
}
