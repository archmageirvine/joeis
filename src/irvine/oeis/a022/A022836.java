package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a008.A008348;

/**
 * A022836 <code>a(n) = c(1)*p(0) + ... + c(n)*p(n-1)</code>, where <code>c(i) = 1</code> if <code>a(i-1) &lt;= p(i-1)</code> and <code>c(i) = -1</code> if <code>a(i-1) &gt; p(i-1)</code> (with <code>p(0) = 1</code> and <code>p(i)</code> a prime for i <code>&gt;= 1)</code>.
 * @author Sean A. Irvine
 */
public class A022836 extends A008348 {
  @Override
  public Z next() {
    return super.next().add(1);
  }
}
