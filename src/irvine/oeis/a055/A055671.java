package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055671 Number of prime Hurwitz quaternions of norm n.
 * @author Sean A. Irvine
 */
public class A055671 extends A055669 {

  {
    setOffset(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return mPrime.isPrime(++mN) ? super.next() : Z.ZERO;
  }
}
