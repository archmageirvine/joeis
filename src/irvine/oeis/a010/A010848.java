package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.a003.A003557;

/**
 * A010848 Number of numbers <code>k &lt;= n</code> such that at least one prime factor of n is not a prime factor of k.
 * @author Sean A. Irvine
 */
public class A010848 extends A003557 {

  @Override
  public Z next() {
    return super.next().negate().add(mN);
  }
}
