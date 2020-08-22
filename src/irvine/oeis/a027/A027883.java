package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a024.A024620;

/**
 * A027883 Positions of primes in sequence (A246655) of primes and prime powers {p^i, i &gt;= 1}.
 * @author Sean A. Irvine
 */
public class A027883 extends A024620 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
