package irvine.oeis.a025;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025224 a(n) = floor(Sum_{k=1..n} sqrt(k)).
 * @author Sean A. Irvine
 */
public class A025224 implements Sequence {

  private CR mSum = CR.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    mSum = mSum.add(CR.valueOf(++mN).sqrt());
    return mSum.floor();
  }
}
