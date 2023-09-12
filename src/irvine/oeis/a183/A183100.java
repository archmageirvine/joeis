package irvine.oeis.a183;

import irvine.math.z.Z;

/**
 * A183100 a(n) is the sum of divisors d of n which are either 1 or of the form Product_{i} (p_i^e_i) where at least one e_i = 1.
 * @author Georg Fischer
 */
public class A183100 extends A183098 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
