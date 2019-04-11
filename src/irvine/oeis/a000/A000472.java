package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000472 <code>a(n) = a(n-1)^2 + (a(n-2) + 1)(a(n-1) - a(n-2)^2 )</code>.
 * @author Sean A. Irvine
 */
public class A000472 implements Sequence {

  private long mN = 0;
  private Z mA = Z.TWO;
  private Z mB = Z.FIVE;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.valueOf(3 * mN - 1);
    } else {
      final Z t = mB.square().add(mA.add(1).multiply(mB.subtract(mA.square())));
      mA = mB;
      mB = t;
      return t;
    }
  }
}
