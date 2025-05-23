package irvine.oeis.a381;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A381767 a(n) = ceiling(n^(n/(n-1))) with a(1)=1.
 * @author Sean A. Irvine
 */
public class A381767 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ONE : CR.valueOf(mN).pow(new Q(mN, mN - 1)).ceil();
  }
}
