package irvine.oeis.a067;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067085 a(n) = floor(Sum_{k=1..n} 1/k^(1/2)).
 * @author Sean A. Irvine
 */
public class A067085 extends Sequence1 {

  private long mN = 0;
  private CR mSum = CR.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(CR.valueOf(++mN).sqrt().inverse());
    return mSum.floor();
  }
}
