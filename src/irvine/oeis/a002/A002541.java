package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002541 <code>a(n) =</code> Sum_{k=1..n-1} floor((n-k)/k).
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
