package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054429 Simple self-inverse permutation of natural numbers: List each block of 2^n numbers (from 2^n to 2^(n+1) - 1) in reverse order.
 * @author Sean A. Irvine
 */
public class A054429 extends Sequence1 {

  private long mT = 2;
  private long mN = 2;

  @Override
  public Z next() {
    final long res = --mN;
    if ((mN & (mN - 1)) == 0) {
      mT <<= 1;
      mN = mT;
    }
    return Z.valueOf(res);
  }
}
