package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000960 Flavius Josephus's sieve: Start with the natural numbers; at the k-th sieving step, remove every (k+1)-st term of the sequence remaining after the (k-1)-st sieving step; iterate.
 * @author Sean A. Irvine
 */
public class A000960 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z a = Z.valueOf(++mN);
    for (long d = mN - 1; d > 0; --d) {
      a = a.add(d - 1).divide(d).add(1).multiply(d);
    }
    return a;
  }
}
