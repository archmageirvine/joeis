package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.PositionSubsequence;

/**
 * A036990 Numbers n such that, in the binary expansion of n, reading from right to left, the number of 1's never exceeds the number of 0's.
 * @author Sean A. Irvine
 */
public class A036990 extends PositionSubsequence {

  /** Construct the sequence. */
  public A036990() {
    super(0, new A036988());
  }

  @Override
  public boolean isOk(final Z term) {
    return Z.ONE.equals(term);
  }
}
