package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.a003.A003319;

/**
 * A167894 Expansion of g.f.: 1/(Sum_{k &gt;= 0} k!*x^k).
 * @author Georg Fischer
 */
public class A167894 extends A003319 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return mN == 0 ? super.next() : super.next().negate();
  }
}
