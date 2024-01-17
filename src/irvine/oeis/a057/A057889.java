package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A057889 Bit-reverse of n, including as many leading as trailing zeros.
 * @author Georg Fischer
 */
public class A057889 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A057889(final int offset) {
    super(offset);
  }

  private int mN;

  /** Construct the sequence. */
  public A057889() {
    super(0);
    mN = -1;
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    if (n == 0) {
      return Z.ZERO;
    }
    final int head0 = Integer.numberOfLeadingZeros(n);
    final int tail0 = Integer.numberOfTrailingZeros(n);
    final int nOrg = n >> tail0;
    final int nRev = ((Integer.reverse(nOrg) >> head0) & ((1 << (32 - head0)) - 1)) >> tail0;
    return Z.valueOf(nOrg != nRev ? (nRev << tail0) : n);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
