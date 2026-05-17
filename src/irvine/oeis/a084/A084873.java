package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A084873 Number of 6-multiantichains of an n-set.
 * @author Sean A. Irvine
 */
public class A084873 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(64).pow(mN)
      .subtract(Z.valueOf(48).pow(mN).multiply(30))
      .add(Z.valueOf(40).pow(mN).multiply(120))
      .add(Z.valueOf(36).pow(mN).multiply(60))
      .add(Z.valueOf(34).pow(mN).multiply(60))
      .subtract(Z.valueOf(33).pow(mN).multiply(12))
      .subtract(Z.valueOf(32).pow(mN).multiply(315))
      .subtract(Z.valueOf(30).pow(mN).multiply(720))
      .add(Z.valueOf(28).pow(mN).multiply(810))
      .add(Z.valueOf(27).pow(mN).multiply(120))
      .add(Z.valueOf(26).pow(mN).multiply(480))
      .add(Z.valueOf(25).pow(mN).multiply(360))
      .subtract(Z.valueOf(24).pow(mN).multiply(1080))
      .subtract(Z.valueOf(23).pow(mN).multiply(720))
      .subtract(Z.valueOf(22).pow(mN).multiply(240))
      .subtract(Z.valueOf(21).pow(mN).multiply(540))
      .add(Z.valueOf(20).pow(mN).multiply(3180))
      .add(Z.valueOf(19).pow(mN).multiply(750))
      .add(Z.valueOf(18).pow(mN).multiply(660))
      .add(Z.valueOf(17).pow(mN).multiply(90))
      .subtract(Z.valueOf(16).pow(mN).multiply(4535))
      .subtract(Z.valueOf(15).pow(mN).multiply(5420))
      .add(Z.valueOf(14).pow(mN).multiply(6750))
      .add(Z.valueOf(13).pow(mN).multiply(5400))
      .subtract(Z.valueOf(12).pow(mN).multiply(13620))
      .add(Z.valueOf(11).pow(mN).multiply(900))
      .add(Z.TEN.pow(mN).multiply(16440))
      .add(Z.NINE.pow(mN).multiply(2740))
      .subtract(Z.EIGHT.pow(mN).multiply(12165))
      .add(Z.SEVEN.pow(mN).multiply(4110))
      .subtract(Z.SIX.pow(mN).multiply(25650))
      .add(Z.FIVE.pow(mN).multiply(25650))
      .add(Z.FOUR.pow(mN).multiply(10474))
      .subtract(Z.THREE.pow(mN).multiply(20948))
      .add(Z.TWO.pow(mN).multiply(7560))
      .divide(720);
  }
}
