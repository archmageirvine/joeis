package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a076.A076832;

/**
 * A034338 Number of binary [ n,4 ] codes of dimension &lt;= 4 without zero columns.
 * @author Sean A. Irvine
 */
public class A034338 extends A076832 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 4);
  }
}

