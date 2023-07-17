package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A003920 Order of universal Chevalley group B_n (3).
 * @author Sean A. Irvine
 */
public class A003920 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A003920(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A003920() {
    super(1);
  }

  private long mN = start();

  static Z orderUniversalChevalleyB(final Z q, final long n) {
    Z p = q.pow(n * n);
    for (long k = 1; k <= n; ++k) {
      p = p.multiply(q.pow(2 * k).subtract(1));
    }
    return p;
  }

  protected int start() {
    return 0;
  }

  protected Z q() {
    return Z.THREE;
  }

  @Override
  public Z next() {
    return orderUniversalChevalleyB(q(), ++mN);
  }
}
