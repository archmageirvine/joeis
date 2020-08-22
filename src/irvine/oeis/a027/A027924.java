package irvine.oeis.a027;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027924 a(n) = least k such that 1+2+...+k &gt;= 1^3 + 2^3 + ... + n^3.
 * @author Sean A. Irvine
 */
public class A027924 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return CR.valueOf(++mN).multiply(mN + 1).divide(CR.SQRT2).round();
  }
}
