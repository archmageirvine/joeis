package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024546 a(n) = [ sum of 1/{k/sqrt(2)} ], k = 1,2,...,n, where {x} := x - [ x ].
 * @author Sean A. Irvine
 */
public class A024546 implements Sequence {

  private long mN = 0;
  private CR mSum = CR.ZERO;

  @Override
  public Z next() {
    final CR s = CR.valueOf(++mN).divide(CR.SQRT2);
    mSum = mSum.add(s.subtract(CR.valueOf(s.floor())).inverse());
    return mSum.floor();
  }
}
