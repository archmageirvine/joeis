package irvine.oeis.a159;
// manually 2024-10-11

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A159715 Number of permutations of 2 indistinguishable copies of 1..n arranged in a circle with exactly 1 local maximum.
 * @author Georg Fischer
 */
public class A159715 extends LinearRecurrence implements DirectSequence {

  private final int mCopies;

  /** Construct the sequence. */
  public A159715() {
    this(2, 2);
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param copies number of copies
   */
  public A159715(final int offset, final int copies) {
    super(2, new long[]{-(copies + 1) * (copies + 1), 2 * (copies + 1)}, new long[]{2 * copies, 3 * copies * (copies + 1)});
    mCopies = copies;
  }

  @Override
  public Z a(final Z n) {
    final int ni = n.intValueExact();
    return Z.valueOf(mCopies + 1).pow(ni - 2).multiply(n).multiply(mCopies);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }
}

