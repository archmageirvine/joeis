package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000545 Number of ways of n-coloring a dodecahedron.
 * @author Sean A. Irvine
 */
public class A000545 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z n4 = mN.pow(4);
    final Z n6 = n4.multiply(mN).multiply(mN);
    final Z n12 = n6.multiply(n6);
    return n12.add(n6.multiply(15)).add(n4.multiply(44)).divide(60);
  }
}
