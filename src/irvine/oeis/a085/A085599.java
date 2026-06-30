package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085599 Number of pairs of coprimes (n-i,n+i), 1&lt;i&lt;n.
 * @author Sean A. Irvine
 */
public class A085599 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long count = 0;
    for (long k = 2; k < mN; ++k) {
      if (Functions.GCD.l(mN + k, mN - k) == 1) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}
