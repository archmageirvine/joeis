package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002541 a(n) = Sum_{k=1..n-1} floor((n-k)/k).
 * @author Sean A. Irvine
 */
public class A002541 extends Sequence1 {

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
