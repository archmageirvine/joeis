package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000960 Flavius Josephus's sieve: Start with the natural numbers; at the k-th sieving step, remove every (k+1)-st term of the sequence remaining after the (k-1)-st sieving step; iterate.
 * @author Sean A. Irvine
 */
public class A000960 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000960(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000960() {
    super(1);
  }

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
