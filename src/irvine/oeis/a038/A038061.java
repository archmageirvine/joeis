package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038061 a(n) = 3^n*n^(n-1).
 * @author Sean A. Irvine
 */
public class A038061 implements Sequence {

  protected int mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(3);
    return Z.valueOf(++mN).pow(mN - 1).multiply(mT);
  }
}
