package irvine.oeis.a054;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054040 a(n) terms of series {1/sqrt(j)} are &gt;= n.
 * @author Sean A. Irvine
 */
public class A054040 extends Sequence1 {

  private long mN = 0;
  private CR mSum = CR.ONE;
  private long mK = 1;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final CR zn = CR.valueOf(mN);
    while (mSum.compareTo(zn) < 0) {
      mSum = mSum.add(CR.valueOf(++mK).sqrt().inverse());
    }
    return Z.valueOf(mK);
  }
}
