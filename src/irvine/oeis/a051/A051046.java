package irvine.oeis.a051;

import irvine.math.q.HarmonicSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A051046 Numbers k for which pi(k) &gt; k/(H_k - 3/2), where pi is the prime-counting function and H_k is the k-th harmonic number.
 * @author Sean A. Irvine
 */
public class A051046 extends A000720 {

  private static final Q C = new Q(3, 2);
  private final HarmonicSequence mHarmonicSequence = new HarmonicSequence();
  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z pi = super.next();
      if (mHarmonicSequence.nextQ().subtract(C).multiply(pi).compareTo(new Q(++mN)) > 0 || mN == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
