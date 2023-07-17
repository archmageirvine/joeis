package irvine.oeis.a056;
// manually A060164/summu1 at 2022-03-25 13:13

import irvine.math.Mobius;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A056476 Number of primitive (aperiodic) palindromic structures of length n using a maximum of two different symbols.
 * @author Georg Fischer
 */
public class A056476 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A056476(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A056476() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    return Integers.SINGLETON.sumdiv(mN, d -> Z.ONE.shiftLeft((mN / d - 1) / 2).multiply(Mobius.mobius(d)));
  }

}
