package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a024.A024996;

/**
 * A026080 <code>Sum{T(n,k)}, k = 0,1,...,n</code>, where T is the array defined in <code>A024996</code>.
 * @author Sean A. Irvine
 */
public class A026080 extends A024996 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return mN == 2 ? Z.FOUR : Z.valueOf(mN + 1);
    }
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(get(mN, k));
    }
    return sum;
  }
}

