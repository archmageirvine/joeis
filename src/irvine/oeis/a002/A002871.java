package irvine.oeis.a002;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002871 a(n) = max_{k=0..n} 2^k*A048993(n,k).
 * @author Sean A. Irvine
 */
public class A002871 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      final Z v = Functions.STIRLING2.z(mN, k).shiftLeft(k);
      if (v.compareTo(max) > 0) {
        max = v;
      }
    }
    return max;
  }
}
