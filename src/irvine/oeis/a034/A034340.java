package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a076.A076832;

/**
 * A034340 Number of binary [ n,6 ] codes of dimension &lt;= 6 without zero columns.
 * @author Sean A. Irvine
 */
public class A034340 extends A076832 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 6);
  }
}

