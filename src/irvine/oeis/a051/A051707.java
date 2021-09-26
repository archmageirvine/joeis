package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a108.A108455;

/**
 * A051707 Number of factorizations of (n,n) into pairs (j,k).
 * @author Sean A. Irvine
 */
public class A051707 extends A108455 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, mN);
  }
}
