package irvine.oeis.a068;

import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068341 Sum{k=1 to n} mu(k) mu(n+1-k), where mu(k) is the Moebius function.
 * @author Sean A. Irvine
 */
public class A068341 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long sum = 0;
    for (long k = 1; k <= mN; ++k) {
      sum += Mobius.mobius(k) * Mobius.mobius(mN + 1 - k);
    }
    return Z.valueOf(sum);
  }
}

