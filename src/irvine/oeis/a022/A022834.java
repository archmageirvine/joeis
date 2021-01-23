package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022834 a(n) = c(1)p(3) + ... + c(n)p(n+2), where c(i) = 1 if a(i-1) &lt;= p(i+2) and c(i) = -1 if a(i-1) &gt; p(i+2) (p(i) = primes).
 * @author Sean A. Irvine
 */
public class A022834 extends A022831 {

  @Override
  protected Z first() {
    return Z.THREE;
  }
}
