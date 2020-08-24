package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a076.A076832;

/**
 * A034342 Number of binary [ n,8 ] codes of dimension &lt;= 8 without zero columns.
 * @author Sean A. Irvine
 */
public class A034342 extends A076832 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 8);
  }
}

