package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A084883 Number of (k,m,n)-multiantichains of multisets with k=3 and m=6.
 * @author Sean A. Irvine
 */
public class A084883 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(729).pow(mN)
      .subtract(Z.valueOf(486).pow(mN).multiply(30))
      .add(Z.valueOf(378).pow(mN).multiply(120))
      .add(Z.valueOf(324).pow(mN).multiply(60))
      .add(Z.valueOf(294).pow(mN).multiply(60))
      .subtract(Z.valueOf(279).pow(mN).multiply(360))
      .subtract(Z.valueOf(276).pow(mN).multiply(12))
      .subtract(Z.valueOf(252).pow(mN).multiply(720))
      .add(Z.valueOf(243).pow(mN).multiply(45))
      .add(Z.valueOf(234).pow(mN).multiply(90))
      .add(Z.valueOf(231).pow(mN).multiply(720))
      .add(Z.valueOf(216).pow(mN).multiply(120))
      .add(Z.valueOf(210).pow(mN).multiply(720))
      .subtract(Z.valueOf(205).pow(mN).multiply(240))
      .add(Z.valueOf(196).pow(mN).multiply(360))
      .subtract(Z.valueOf(189).pow(mN).multiply(720))
      .subtract(Z.valueOf(187).pow(mN).multiply(180))
      .add(Z.valueOf(186).pow(mN).multiply(720))
      .subtract(Z.valueOf(176).pow(mN).multiply(720))
      .add(Z.valueOf(168).pow(mN).multiply(120))
      .subtract(Z.valueOf(167).pow(mN).multiply(720))
      .add(Z.valueOf(165).pow(mN).multiply(360))
      .subtract(Z.valueOf(162).pow(mN).multiply(900))
      .subtract(Z.valueOf(157).pow(mN).multiply(720))
      .add(Z.valueOf(156).pow(mN).multiply(180))
      .add(Z.valueOf(148).pow(mN).multiply(720))
      .subtract(Z.valueOf(145).pow(mN).multiply(240))
      .add(Z.valueOf(138).pow(mN).multiply(720))
      .add(Z.valueOf(134).pow(mN).multiply(30))
      .subtract(Z.valueOf(129).pow(mN).multiply(240))
      .add(Z.valueOf(126).pow(mN).multiply(2700))
      .subtract(Z.valueOf(120).pow(mN).multiply(360))
      .add(Z.valueOf(111).pow(mN).multiply(180))
      .add(Z.valueOf(108).pow(mN).multiply(900))
      .subtract(Z.valueOf(102).pow(mN).multiply(20))
      .add(Z.valueOf(98).pow(mN).multiply(450))
      .subtract(Z.valueOf(93).pow(mN).multiply(5400))
      .subtract(Z.valueOf(84).pow(mN).multiply(5400))
      .add(Z.valueOf(81).pow(mN).multiply(685))
      .add(Z.valueOf(78).pow(mN).multiply(1350))
      .add(Z.valueOf(77).pow(mN).multiply(5400))
      .add(Z.valueOf(70).pow(mN).multiply(5400))
      .subtract(Z.valueOf(63).pow(mN).multiply(5400))
      .add(Z.valueOf(56).pow(mN).multiply(900))
      .subtract(Z.valueOf(54).pow(mN).multiply(8220))
      .add(Z.valueOf(42).pow(mN).multiply(16440))
      .add(Z.valueOf(36).pow(mN).multiply(2740))
      .subtract(Z.valueOf(31).pow(mN).multiply(16440))
      .add(Z.valueOf(27).pow(mN).multiply(4275))
      .add(Z.valueOf(26).pow(mN).multiply(4110))
      .subtract(Z.valueOf(18).pow(mN).multiply(25650))
      .add(Z.valueOf(14).pow(mN).multiply(25650))
      .add(Z.NINE.pow(mN).multiply(10474))
      .subtract(Z.SIX.pow(mN).multiply(20948))
      .add(Z.THREE.pow(mN).multiply(7560))
      .divide(720);
  }
}
