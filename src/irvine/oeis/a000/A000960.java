package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000960 Flavius Josephus's sieve: Start with the natural numbers; at the k-th sieving step, remove every <code>(k+1)-st</code> term of the sequence remaining after the <code>(k-1)-st</code> sieving step; iterate.
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
