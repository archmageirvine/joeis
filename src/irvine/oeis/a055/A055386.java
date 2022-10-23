package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055386 Smallest factor of (2n)^(2n) + 1.
 * @author Sean A. Irvine
 */
public class A055386 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    mN += 2;
    return Jaguar.factor(Z.valueOf(mN).pow(mN).add(1)).leastPrimeFactor();
  }
}
