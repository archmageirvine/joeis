package irvine.oeis.a059;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059617 Denominator of (n*(n-1)/(8*(2*n+1)).
 * @author Sean A. Irvine
 */
public class A059617 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return new Q(mN * ++mN, 8 * (2 * mN + 1)).den();
  }
}
