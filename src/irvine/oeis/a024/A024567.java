package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024567 a(n) = integer nearest a(n-1)/(sqrt(7) - 2), where a(1) = 1.
 * @author Sean A. Irvine
 */
public class A024567 extends Sequence1 {

  private static final CR C = CR.SEVEN.sqrt().subtract(CR.TWO);
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : CR.valueOf(mA).divide(C).round();
    return mA;
  }
}
