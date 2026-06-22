package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A006521 Numbers k such that k divides 2^k + 1.
 * @author Sean A. Irvine
 */
public class A006521 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A006521(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A006521() {
    super(1);
  }

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.ONE.shiftLeft(mN).add(1).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
