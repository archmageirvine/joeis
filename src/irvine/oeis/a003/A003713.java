package irvine.oeis.a003;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003713.
 * @author Sean A. Irvine
 */
public class A003713 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    Z f = Z.ONE;
    for (long k = 1; k <= mN; ++k) {
      s = s.add(f.multiply(Stirling.firstKind(mN, k).abs()));
      f = f.multiply(k);
    }
    return s;
  }
}
