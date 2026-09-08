package irvine.oeis.a174;

import irvine.math.z.Z;
import irvine.oeis.a083.A083847;

/**
 * A174246 Number of primes of the form x^2 + 1 &lt; 2^n.
 * @author Georg Fischer
 */
public class A174246 extends A083847 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z result = super.next();
    return ++mN == 1 ? result.subtract(1) : result;
  }
}
