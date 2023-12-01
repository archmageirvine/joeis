package irvine.oeis.a067;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067038 a(n) = floor(n^m) where m = Sum_{k=1..n} (1/k).
 * @author Sean A. Irvine
 */
public class A067038 extends Sequence1 {

  private Q mSum = Q.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    mSum = mSum.add(new Q(1, ++mN));
    return CR.valueOf(mN).pow(CR.valueOf(mSum)).floor();
  }
}

