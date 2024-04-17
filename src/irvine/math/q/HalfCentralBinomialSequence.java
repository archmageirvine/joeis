package irvine.math.q;

import irvine.math.api.RationalSequence;
import irvine.math.z.Z;

/**
 * Generate terms of <code>binomial(n,n/2)</code> for odd n (premultiplied by <code>sqrt(pi)</code>).
 * @author Sean A. Irvine
 */
public class HalfCentralBinomialSequence implements RationalSequence {

  private long mN = 0;
  private Q mA = new Q(4);

  @Override
  public final Q nextQ() {
    if (++mN > 1) {
      mA = mA.multiply(new Q(Z.valueOf(mN - 1).shiftLeft(3), 2 * mN - 1));
    }
    return mA;
  }
}

