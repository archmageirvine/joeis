package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024581 <code>a(n) =</code> integer nearest <code>e*a(n-1)</code>, where <code>a(0) = 1</code>.
 * @author Sean A. Irvine
 */
public class A024581 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : CR.valueOf(mA).multiply(CR.E).round();
    return mA;
  }
}
