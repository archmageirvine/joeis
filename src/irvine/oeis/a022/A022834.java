package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022834 <code>a(n) = c(1)p(3) +</code> ... <code>+ c(n)p(n+2)</code>, where <code>c(i) = 1</code> if <code>a(i-1) &lt;= p(i+2)</code> and <code>c(i) = -1</code> if <code>a(i-1) &gt; p(i+2) (p(i) =</code> primes).
 * @author Sean A. Irvine
 */
public class A022834 extends A022831 {

  @Override
  protected Z first() {
    return Z.THREE;
  }
}
