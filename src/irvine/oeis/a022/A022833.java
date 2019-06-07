package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022833 <code>a(n) = c(1)p(2) + ... + c(n)p(n+1)</code>, where <code>c(i) = 1</code> if <code>a(i-1) &lt;= p(i+1)</code> and <code>c(i) = -1</code> if <code>a(i-1) &gt; p(i+1) (p(i) =</code> primes).
 * @author Sean A. Irvine
 */
public class A022833 extends A022831 {

  @Override
  protected Z first() {
    return Z.TWO;
  }
}
