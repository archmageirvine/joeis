package irvine.oeis.a002;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002871 <code>a(n) =</code> max_{k=0..n} 2^k*A048993(n,k).
 * @author Sean A. Irvine
 */
public class A002871 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      final Z v = Stirling.secondKind(mN, k).shiftLeft(k);
      if (v.compareTo(max) > 0) {
        max = v;
      }
    }
    return max;
  }
}
