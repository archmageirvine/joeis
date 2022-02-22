package irvine.oeis;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * Sequences with the rules:
 * (1) "Start with k and repeatedly reverse the digits and add m to get the next term", and
 * (2) "Reverse and Add!": reverse and add old value
 * @author Georg Fischer
 */
public class RADDSequence implements Sequence {

  protected final long mBase;
  protected Z mTerm;
  protected Z mIncrement;
  protected boolean mAddThis; // whether the old value should be added

  /**
   * Creates a RADD! type sequence.
   * @param base base of the number system, normally 10 or 2
   * @param start start value
   */
  public RADDSequence(final long base, final long start) {
    this(base, Z.valueOf(start));
  }

  /**
   * Creates a RADD! type sequence.
   * @param base base of the number system, normally 10 or 2
   * @param start start value
   */
  public RADDSequence(final long base, final Z start) {
    mBase = base;
    mTerm = start;
    mAddThis = true;
  }

  /**
   * Creates a RADD type sequence.
   * @param base base of the number system, normally 10 or 2
   * @param start start value
   * @param increment increment by this value
   */
  public RADDSequence(final long base, final long start, final long increment) {
    this(base, Z.valueOf(start), increment);
  }

  /**
   * Creates a RADD type sequence.
   * @param base base of the number system, normally 10 or 2
   * @param start start value
   * @param increment increment by this value
   */
  public RADDSequence(final long base, final Z start, final long increment) {
    mBase = base;
    mIncrement = Z.valueOf(increment);
    mTerm = start;
    mAddThis = false;
  }

  @Override
  public Z next() {
    final Z result = mTerm;
    mTerm = ZUtils.reverse(mTerm, mBase).add(mAddThis ? mTerm : mIncrement);
    return result;
  }
}
