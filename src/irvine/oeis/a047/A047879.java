package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a049.A049604;

/**
 * A047879 a(n)=Sum{T(n,i): i=0,1,...,n}+Sum{T(i,n): i=0,1,...,n-1}, array T counting least number of knight's moves as in A049604.
 * @author Sean A. Irvine
 */
public class A047879 extends A049604 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(get(mN + k, k)).add(get(mN + k, mN));
    }
    return sum.subtract(get(2 * mN, mN));
  }
}
