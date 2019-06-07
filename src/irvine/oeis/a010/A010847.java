package irvine.oeis.a010;

import irvine.math.z.Z;

/**
 * A010847 Number of numbers <code>&lt;= n</code> with a prime factor that does not divide <code>n</code>.
 * @author Sean A. Irvine
 */
public class A010847 extends A010846 {

  @Override
  public Z next() {
    return super.next().negate().add(mN);
  }
}
