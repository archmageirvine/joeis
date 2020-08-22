package irvine.oeis.a010;

import irvine.math.z.Z;

/**
 * A010847 Number of numbers &lt;= n with a prime factor that does not divide n.
 * @author Sean A. Irvine
 */
public class A010847 extends A010846 {

  @Override
  public Z next() {
    return super.next().negate().add(mN);
  }
}
