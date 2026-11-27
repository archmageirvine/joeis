package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087571 Smallest prime which has the form of the concatenation n, n-1, n-2, n-3, .., n-k for some k &lt; n, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A087571 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    long k = mN;
    while (k > 0) {
      sb.append(k);
      final Z t = new Z(sb);
      if (t.isProbablePrime()) {
        return t;
      }
      --k;
    }
    return Z.ZERO;
  }
}
