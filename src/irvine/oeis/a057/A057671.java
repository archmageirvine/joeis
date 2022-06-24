package irvine.oeis.a057;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057671 a(n) equals floor(Vc(n) - Vs(n)), where Vc(n) is the volume of the cube with side length n and Vs(n) is the volume of the sphere of diameter n.
 * @author Sean A. Irvine
 */
public class A057671 implements Sequence {

  private static final CR C = CR.ONE.subtract(CR.PI.divide(CR.SIX));
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return C.multiply(mN.pow(3)).floor();
  }
}
