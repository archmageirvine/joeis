package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.a003.A003603;

/**
 * A019586 Vertical para-Fibonacci sequence: takes value i on later (i.e., b_j, j &gt;= 2) terms of i-th Fibonacci sequence defined by b_0 = i, b_1 = [ tau(i+1) ].
 * @author Sean A. Irvine
 */
public class A019586 extends A003603 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
