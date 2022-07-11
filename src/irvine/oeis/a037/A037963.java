package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037963 a(n) = n^2*(n+1)*(3*n^2 + 7*n - 2)*(n+5)!/11520.
 * @author Sean A. Irvine
 */
public class A037963 implements Sequence {

  private long mN = -1;
  private Z mF = Z.valueOf(24);

  @Override
  public Z next() {
    mF = mF.multiply(++mN + 5);
    return mF.multiply(mN).multiply(mN).multiply(mN + 1)
      .multiply(Z.THREE.multiply(mN).add(7).multiply(mN).subtract(2))
      .divide(11520);
  }
}
