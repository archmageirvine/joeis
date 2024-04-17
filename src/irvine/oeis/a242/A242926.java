package irvine.oeis.a242;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a001.A001610;

/**
 * A242926 a(n) = denominator of B(0,n), where B(n,n) = 0, B(n-1,n) = 1/n and otherwise B(m,n) = B(m-1,n+1) - B(m-1,n).
 * @author Sean A. Irvine
 */
public class A242926 extends A001610 {

  private long mN = 0;

  @Override
  public Z next() {
    return new Q(super.next(), ++mN).den();
  }
}
