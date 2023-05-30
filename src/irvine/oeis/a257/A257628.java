package irvine.oeis.a257;

import irvine.math.z.Z;
import irvine.oeis.a010.A010815;

/**
 * A257628 Expansion of 1 - f(-x) in powers of x where f() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A257628 extends A010815 {

  private int mN = -1;

  @Override
  public Z next() {
    return (++mN == 0) ? super.next().subtract(1) : super.next().negate();
  }
}
