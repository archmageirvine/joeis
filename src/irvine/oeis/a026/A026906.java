package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a036.A036469;

/**
 * A026906 Number of sums S of distinct positive integers satisfying S <code>&lt;= n</code>.
 * @author Sean A. Irvine
 */
public class A026906 extends A036469 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
