package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065048 Largest unsigned Stirling number of the first kind: max_k(s(n+1,k)); i.e., largest coefficient of polynomial x*(x+1)*(x+2)*(x+3)*...*(x+n).
 * @author Sean A. Irvine
 */
public class A065048 extends Sequence0 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      max = max.max(Functions.STIRLING1.z(mN, k).abs());
    }
    return max;
  }
}

