package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A024576 a(n) = [ e*a(n-1) ], where a(0) = 1.
 * @author Sean A. Irvine
 */
public class A024576 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : CR.valueOf(mA).multiply(CR.E).floor();
    return mA;
  }
}
