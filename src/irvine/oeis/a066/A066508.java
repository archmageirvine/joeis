package irvine.oeis.a066;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066508 a(n) = floor(Sum_{i=1..n} (1/i)^(1/i)).
 * @author Sean A. Irvine
 */
public class A066508 extends Sequence1 {

  private long mN = 0;
  private CR mSum = CR.ZERO;

  @Override
  public Z next() {
    final Q q = new Q(1, ++mN);
    mSum = mSum.add(CR.valueOf(q).pow(q));
    return mSum.floor();
  }
}

