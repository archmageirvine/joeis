package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a008.A008348;

/**
 * A022836 a(n) = c(1)*p(0) + ... + c(n)*p(n-1), where c(i) = 1 if a(i-1) &lt;= p(i-1) and c(i) = -1 if a(i-1) &gt; p(i-1) (with p(0) = 1 and p(i) a prime for i &gt;= 1).
 * @author Sean A. Irvine
 */
public class A022836 extends A008348 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
