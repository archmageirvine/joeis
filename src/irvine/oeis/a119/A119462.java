package irvine.oeis.a119;

import irvine.math.z.Z;
import irvine.oeis.a034.A034839;

/**
 * A119462 Triangle read by rows: T(n,k) is the number of circular binary words of length n having k occurrences of 01 (0 &lt;= k &lt;= floor(n/2)).
 * @author Georg Fischer
 */
public class A119462 extends A034839 {

  private int mN = -1;

  @Override
  public Z next() {
    return (++mN == 0) ? super.next() : super.next().multiply2();
  }
}
