package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a076.A076832;

/**
 * A034337 Number of inequivalent binary [ n,3 ] codes of dimension &lt;= 3 without zero columns.
 * @author Sean A. Irvine
 */
public class A034337 extends A076832 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 3);
  }
}

