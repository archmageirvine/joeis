package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A011975 Covering numbers C(n,3,2).
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A011975 extends AbstractSequence implements DirectSequence {

  private int mN;
  private int mP2; // second parameter
  private int mP3; // third parameter

  /** Construct the sequence. */
  public A011975() {
    this(3, 3, 2);
  }

  /**
   * Generic Constructor with parameters.
   * @param offset first index
   * @param p2 second parameter
   * @param p3 third parameter
   */
  public A011975(final int offset, final int p2, final int p3) {
    super(offset);
    mN = offset - 1;
    mP2 = p2;
    mP3 = p3;
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    Z b = Z.ONE;
    for (int k = n - 1; k <= n; ++k) {
      b = b.multiply(k).add(k - n + mP3).divide(k - n + mP2);
    }
    return b;
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
