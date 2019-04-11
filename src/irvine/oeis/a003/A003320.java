package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003320 <code>a(n) =</code> max_{k=0..n} k^(n-k).
 * @author Sean A. Irvine
 */
public class A003320 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      max = max.max(Z.valueOf(k).pow(mN - k));
    }
    return max;
  }
}

