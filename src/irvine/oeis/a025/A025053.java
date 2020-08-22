package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025053 Positions of primes in sequence A025051 (numbers of form j*k + k*i + i*j, without repetitions, where 1 &lt;=i &lt;= j &lt;= k).
 * @author Sean A. Irvine
 */
public class A025053 extends A025051 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
