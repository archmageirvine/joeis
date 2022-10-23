package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A046666 a(n) = n - (smallest prime dividing n).
 * @author Sean A. Irvine
 */
public class A046666 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).subtract(Jaguar.factor(mN).leastPrimeFactor());
  }
}
