package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005914 Number of points on surface of hexagonal prism: 12*n^2 + 2 for n &gt; 0 (coordination sequence for W(2)).
 * @author Sean A. Irvine
 */
public class A005914 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.isZero() ? Z.ONE : mN.square().multiply(12).add(2);
  }
}
