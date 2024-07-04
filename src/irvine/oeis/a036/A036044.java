package irvine.oeis.a036;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A036044 BCR(n): write in binary, complement, reverse.
 * @author Sean A. Irvine
 */
public class A036044 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A036044(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A036044() {
    super(0);
  }

  protected long mN = -1;

  @Override
  public Z a(final Z n) {
    if (n.isZero()) {
      return Z.ONE;
    }
    final Z mask = Z.ONE.shiftLeft(n.bitLength()).subtract(1);
    return Functions.REVERSE.z(2, n).not().and(mask);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }
}

