package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.a167.A167185;

/**
 * A069585 a(n) = n - largest prime power &lt;= n.
 * @author Sean A. Irvine
 */
public class A069585 extends A167185 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).subtract(super.next());
  }
}
