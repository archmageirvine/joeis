package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a005.A005001;

/**
 * A024716 a(n) = Sum_{1 &lt;= j &lt;= i &lt;= n} S(i,j), where S(i,j) are Stirling numbers of the second kind.
 * @author Sean A. Irvine
 */
public class A024716 extends A005001 {

  {
    setOffset(1);
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
