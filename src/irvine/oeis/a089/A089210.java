package irvine.oeis.a089;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A089210 a(n) = n^(n^(n-1)).
 * @author Georg Fischer
 */
public class A089210 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A089210(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A089210() {
    super(1);
  }

  private int mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.pow(n.pow(mN - 1));
  }
}
