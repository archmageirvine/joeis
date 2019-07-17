package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024557 <code>a(n) = [ a(n-1)/(sqrt(6) - 2) ]</code>, where <code>a(0) = 1</code>.
 * @author Sean A. Irvine
 */
public class A024557 implements Sequence {

  private static final CR C = CR.valueOf(6).sqrt().subtract(CR.TWO);
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : CR.valueOf(mA).divide(C).floor();
    return mA;
  }
}
