package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024587 Integer nearest <code>a(n-1)/(pi - 3)</code>, where <code>a(0) = 1</code>.
 * @author Sean A. Irvine
 */
public class A024587 implements Sequence {

  private static final CR C = CR.PI.subtract(CR.THREE);
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : CR.valueOf(mA).divide(C).round();
    return mA;
  }
}
