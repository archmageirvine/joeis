package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A084872 Number of 5-multiantichains of an n-set.
 * @author Sean A. Irvine
 */
public class A084872 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(32).pow(mN).
      subtract(Z.valueOf(24).pow(mN).multiply(20))
      .add(Z.valueOf(20).pow(mN).multiply(60))
      .add(Z.valueOf(18).pow(mN).multiply(20))
      .add(Z.valueOf(17).pow(mN).multiply(10))
      .subtract(Z.valueOf(16).pow(mN).multiply(90))
      .subtract(Z.valueOf(15).pow(mN).multiply(120))
      .add(Z.valueOf(14).pow(mN).multiply(150))
      .add(Z.valueOf(13).pow(mN).multiply(120))
      .subtract(Z.valueOf(12).pow(mN).multiply(480))
      .add(Z.valueOf(11).pow(mN).multiply(20))
      .add(Z.TEN.pow(mN).multiply(720))
      .add(Z.NINE.pow(mN).multiply(120))
      .subtract(Z.EIGHT.pow(mN).multiply(445))
      .add(Z.SEVEN.pow(mN).multiply(180))
      .subtract(Z.SIX.pow(mN).multiply(1650))
      .add(Z.FIVE.pow(mN).multiply(1650))
      .add(Z.FOUR.pow(mN).multiply(870))
      .subtract(Z.THREE.pow(mN).multiply(1740))
      .add(Z.TWO.pow(mN).multiply(744))
      .divide(120);
  }
}
