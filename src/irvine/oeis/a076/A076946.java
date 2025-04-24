package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076946 Smallest k such that n*(n+1)*(n+2)...*(n+k) &gt;= n^n.
 * @author Sean A. Irvine
 */
public class A076946 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.valueOf(mN);
    final Z t = prod.pow(mN);
    long k = 0;
    while (prod.compareTo(t) < 0) {
      prod = prod.multiply(mN + ++k);
    }
    return Z.valueOf(k);
  }
}

