package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024582 a(n) = floor( a(n-1)/(Pi - 3) ) with n&gt;0, a(0)=1.
 * @author Sean A. Irvine
 */
public class A024582 implements Sequence {

  private static final CR C = CR.PI.subtract(CR.THREE);
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : CR.valueOf(mA).divide(C).floor();
    return mA;
  }
}
