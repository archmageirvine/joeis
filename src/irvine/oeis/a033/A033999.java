package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A033999 a(n) = (-1)^n.
 * @author Georg Fischer
 */
public class A033999 extends AbstractSequence implements DirectSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A033999() {
    super(0);
  }

  @Override
  public Z a(final Z n) {
    return n.testBit(0) ? Z.NEG_ONE : Z.ONE;
  }

  @Override
  public Z a(final int n) {
    return ((n & 1) == 1) ? Z.NEG_ONE : Z.ONE;
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
