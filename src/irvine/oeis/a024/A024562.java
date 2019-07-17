package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024562 <code>a(n) =</code> integer nearest <code>a(n-1)/(sqrt(6) - 2)</code>, where <code>a(0) = 1</code>.
 * @author Sean A. Irvine
 */
public class A024562 implements Sequence {

  private static final CR C = CR.valueOf(6).sqrt().subtract(CR.TWO);
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : CR.valueOf(mA).divide(C).round();
    return mA;
  }
}
