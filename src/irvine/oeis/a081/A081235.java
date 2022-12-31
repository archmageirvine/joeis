package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.a055.A055382;

/**
 * A081235 Smallest prime starting a sequence of 2n consecutive primes with symmetrical gaps about the center.
 * @author Georg Fischer
 */
public class A081235 extends A055382 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z result = super.next();
    return (mN == 1) ? Z.TWO : result;
  }
}
