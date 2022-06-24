package irvine.oeis.a057;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057672 a(n) equals floor(As(n) - Ac(n)), where As(n) is the area of the square with side length n and Ac(n) is the area of the circle of diameter n.
 * @author Sean A. Irvine
 */
public class A057672 implements Sequence {

  private static final CR C = CR.ONE.subtract(CR.PI.divide(CR.FOUR));
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return C.multiply(mN.square()).floor();
  }
}
