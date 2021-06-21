package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.a345.A345530;

/**
 * A019311 Number of words of length n (n &gt;= 1) over a two-letter alphabet having a minimal period of size n-2.
 * @author Sean A. Irvine
 */
public class A019311 extends A345530 {

  @Override
  public Z next() {
    computeNextRow();
    return mCounts.length <= 2 ? Z.ZERO : Z.valueOf(mCounts[2]);
  }
}
