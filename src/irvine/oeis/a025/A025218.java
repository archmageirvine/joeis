package irvine.oeis.a025;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025218 [ Sum{sqrt(k+1)} ], k = 1,2,...,n.
 * @author Sean A. Irvine
 */
public class A025218 implements Sequence {

  private long mN = 1;
  private CR mSum = CR.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(CR.valueOf(++mN).sqrt());
    return mSum.floor();
  }
}
