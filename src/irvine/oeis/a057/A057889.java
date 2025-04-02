package irvine.oeis.a057;
// manually 2025-04-01 direct

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A057889 Bijective bit-reverse of n: keep the trailing zeros in the binary expansion of n fixed, but reverse all the digits up to that point.
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
    if (n.isZero()) {
      return Z.ZERO;
    }
    final Z odd = n.makeOdd();
    final long bits = odd.auxiliary();
    return Functions.REVERSE.z(2, odd).shiftLeft(bits);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }

}
