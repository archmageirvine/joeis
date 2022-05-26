package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056110 Highest proper factor of n!-1, or a(n)=1 if n!-1 is not composite.
 * @author Sean A. Irvine
 */
public class A056110 implements Sequence {

  private int mN = 1;
  private Z mF = Z.TWO;

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    final Z t = mF.subtract(1);
    return t.divide(Jaguar.factor(t).leastPrimeFactor());
  }
}
