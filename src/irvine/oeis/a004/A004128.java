package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004128 <code>a(n) =</code> Sum_{k=1..n} floor(3n/3^k).
 * @author Sean A. Irvine
 */
public class A004128 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    long d = 1;
    long k;
    while ((k = mN / d) > 0) {
      sum = sum.add(k);
      d *= 3L;
    }
    return sum;
  }
}
