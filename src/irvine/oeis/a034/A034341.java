package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a076.A076832;

/**
 * A034341 Number of binary [ n,7 ] codes of dimension &lt;= 7 without zero columns.
 * @author Sean A. Irvine
 */
public class A034341 extends A076832 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 7);
  }
}

