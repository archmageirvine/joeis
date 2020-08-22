package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007589 Dodecahedral surface numbers: a(0)=0, a(1)=1, a(2)=20, thereafter 2*((3*n-7)^2 + 21).
 * @author Sean A. Irvine
 */
public class A007589 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    switch (++mN) {
      case 0:
        return Z.ZERO;
      case 1:
        return Z.ONE;
      case 2:
        return Z.valueOf(20);
      default:
        return Z.valueOf(mN).multiply(3).subtract(7).square().add(21).multiply2();
    }
  }
}
