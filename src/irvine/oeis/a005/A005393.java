package irvine.oeis.a005;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005393 Leading term of Stirling's approximation to <code>n!,</code> sqrt(2*Pi)*n^(n+(1/2))/e^n, rounded down.
 * @author Sean A. Irvine
 */
public class A005393 implements Sequence {

  private static final ComputableReals C = ComputableReals.SINGLETON;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ZERO;
    }
    final CR n = CR.valueOf(mN);
    return C.pow(n, n.add(CR.HALF)).multiply(CR.TAU.sqrt()).divide(n.exp()).floor(32);
  }
}
