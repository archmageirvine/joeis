package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a194.A194543;

/**
 * A025157 Number of partitions of n with distinct parts p(i) such that if i != j, then |p(i) - p(j)| &gt;= 3.
 * @author Sean A. Irvine
 */
public class A025157 extends A194543 {

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, 3);
  }
}
