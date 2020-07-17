package irvine.oeis;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * Sequences with the rule:
 * "Start with k and repeatedly reverse the digits and add m to get the next term."
 * @author Georg Fischer
 */
public class RADDSequence implements Sequence {

  protected final long mBase;
  protected Z mTerm;
  protected Z mIncrement;

  /**
   * Creates a RADD type sequence.
   * @param base base of the number system, normally 10 or 2
   * @param start start value
   * @param increment increment by this value
   */
  public RADDSequence(final long base, final long start, final long increment) {
    mBase = base;
    mIncrement = Z.valueOf(increment);
    mTerm = Z.valueOf(start);
  }

  @Override
  public Z next() {
    final Z result = mTerm;
    mTerm = ZUtils.reverse(mTerm, mBase).add(mIncrement);
    return result;
  }
}
