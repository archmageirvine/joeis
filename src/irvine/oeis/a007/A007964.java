package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007964 Numbers k such that product of proper divisors of k is <code>&lt;=</code> k; i.e., product of divisors of k is <code>&lt;= k^2</code>.
 * @author Sean A. Irvine
 */
public class A007964 extends A007956 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().compareTo(mN) <= 0) {
        return mN;
      }
    }
  }
}
