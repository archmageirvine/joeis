package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055385 Smallest prime factor of n^n + 1.
 * @author Sean A. Irvine
 */
public class A055385 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(Z.valueOf(++mN).pow(mN).add(1)).leastPrimeFactor();
  }
}
