package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002541.
 * @author Sean A. Irvine
 */
public class A002541 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (long k = 2; k <= mN; ++k) {
      s = s.add(mN / k);
    }
    return s;
  }
}
