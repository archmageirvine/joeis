package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032427 Coefficients of Jacobi elliptic function <code>c(4,m)</code>.
 * @author Sean A. Irvine
 */
public class A032427 implements Sequence {

  // After Vaclav Kotesovec

  private int mN = -1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return Z.THREE.pow(4 * mN + 19)
      .subtract(Z.SEVEN.pow(2 * mN + 9).multiply(24L * mN + 36))
      .add(Z.FIVE.pow(2 * mN + 9).multiply(n.multiply(96).add(312).multiply(mN).add(150)))
      .subtract(Z.THREE.pow(2 * mN + 9).multiply(n.multiply(256).add(1344).multiply(mN).add(1520).multiply(mN).add(117)))
      .add(n.multiply(512).add(3584).multiply(mN).add(6208).multiply(mN).add(1336).multiply(mN).subtract(846))
      .divide(196608);
  }
}
