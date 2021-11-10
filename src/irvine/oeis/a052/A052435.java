package irvine.oeis.a052;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A052435.
 * @author Sean A. Irvine
 */
public class A052435 extends A000720 {

  private long mN = 1;
  {
    super.next();
  }

  @Override
  public Z next() {
    return CR.valueOf(++mN).li().subtract(CR.valueOf(super.next())).round();
  }
}
