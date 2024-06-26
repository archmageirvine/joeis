package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A001285 Thue-Morse sequence: let A_k denote the first 2^k terms; then A_0 = 1 and for k &gt;= 0, A_{k+1} = A_k B_k, where B_k is obtained from A_k by interchanging 1's and 2's.
 * @author Sean A. Irvine
 */
public class A001285 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A001285(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A001285() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return Z.valueOf(1 + (n.bitCount() & 1));
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(1 + (Integer.bitCount(n) & 1));
  }

}
