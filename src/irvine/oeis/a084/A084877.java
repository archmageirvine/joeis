package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A084877 Number of (k,m,n)-antichains of multisets with k=3 and m=5.
 * @author Sean A. Irvine
 */
public class A084877 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(243).pow(mN)
      .subtract(Z.valueOf(162).pow(mN).multiply(20))
      .add(Z.valueOf(126).pow(mN).multiply(60))
      .add(Z.valueOf(108).pow(mN).multiply(20))
      .add(Z.valueOf(98).pow(mN).multiply(10))
      .subtract(Z.valueOf(93).pow(mN).multiply(120))
      .subtract(Z.valueOf(84).pow(mN).multiply(120))
      .add(Z.valueOf(81).pow(mN).multiply(10))
      .add(Z.valueOf(78).pow(mN).multiply(30))
      .add(Z.valueOf(77).pow(mN).multiply(120))
      .add(Z.valueOf(70).pow(mN).multiply(120))
      .subtract(Z.valueOf(63).pow(mN).multiply(120))
      .add(Z.valueOf(56).pow(mN).multiply(20))
      .subtract(Z.valueOf(54).pow(mN).multiply(120))
      .add(Z.valueOf(42).pow(mN).multiply(240))
      .add(Z.valueOf(36).pow(mN).multiply(40))
      .subtract(Z.valueOf(31).pow(mN).multiply(240))
      .add(Z.valueOf(27).pow(mN).multiply(35))
      .add(Z.valueOf(26).pow(mN).multiply(60))
      .subtract(Z.valueOf(18).pow(mN).multiply(210))
      .add(Z.valueOf(14).pow(mN).multiply(210))
      .add(Z.NINE.pow(mN).multiply(50))
      .subtract(Z.SIX.pow(mN).multiply(100))
      .add(Z.THREE.pow(mN).multiply(24))
      .divide(120);
  }
}
