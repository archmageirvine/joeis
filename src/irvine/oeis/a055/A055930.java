package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055930 Number of distinct prime factors of totient of (n-th prime)!.
 * @author Sean A. Irvine
 */
public class A055930 extends A055929 {

  @Override
  public Z next() {
    return Z.valueOf(mFactor.factorize(super.next()).omega());
  }
}
