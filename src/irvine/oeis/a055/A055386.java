package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055386 Smallest factor of (2n)^(2n) + 1.
 * @author Sean A. Irvine
 */
public class A055386 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    mN += 2;
    return Jaguar.factor(Z.valueOf(mN).pow(mN).add(1)).leastPrimeFactor();
  }
}
