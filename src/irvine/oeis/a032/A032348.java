package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032348.
 * @author Sean A. Irvine
 */
public class A032348 implements Sequence {

  // After Vaclav Kotesovec

  private int mN = -1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return Z.NINE.pow(mN + 4).multiply(104L * mN)
      .add(Z.SEVEN.pow(2 * mN + 7).multiply(3))
      .subtract(Z.FIVE.pow(2 * mN + 7).multiply(24L * mN + 36))
      .add(Z.THREE.pow(2 * mN + 8).multiply(n.square().multiply(32).add(54)))
      .subtract(n.multiply(256).add(1248).multiply(mN).add(1328).multiply(mN).subtract(135))
      .divide(12288);
  }
}
