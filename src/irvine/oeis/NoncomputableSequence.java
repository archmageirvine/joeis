package irvine.oeis;

import java.util.Collection;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * Base case for certain finite sequences generated verbatim from a list.
 * Same as FiniteSequence, but throws <code>UnsupportedOperationException</code> at the end.
 * @author Georg Fischer
 */
public class NoncomputableSequence extends FiniteSequence {

  private int mN = -1;

  /**
   * Construct the sequence.
   * @param seq the values
   */
  public NoncomputableSequence(final long... seq) {
    super(DEFOFF, NONCOMPUTABLE, seq);
  }

  /**
   * Construct the sequence.
   * @param seq the values
   */
  public NoncomputableSequence(final Z... seq) {
    super(DEFOFF, NONCOMPUTABLE, seq);
  }

  /**
   * Construct the sequence.
   * @param seq the values
   */
  public NoncomputableSequence(final Collection<Z> seq) {
    super(DEFOFF, NONCOMPUTABLE, seq);
  }

  /**
   * Construct the sequence.
   * @param offset first index
   * @param attr attribute
   * @param seq the values
   */
  public NoncomputableSequence(final int offset, final String attr, final long... seq) {
    super(offset, attr, seq);
  }

  /**
   * Construct the sequence.
   * @param offset first index
   * @param attr attribute
   * @param seq the values
   */
  public NoncomputableSequence(final int offset, final String attr, final Z... seq) {
    super(offset, attr, seq);
  }

  /**
   * Construct the sequence.
   * @param offset first index
   * @param attr attribute
   * @param seq the values
   */
  public NoncomputableSequence(final int offset, final String attr, final Collection<Z> seq) {
    super(offset, attr, seq);
  }

  /**
   * Construct the sequence.
   * @param offset first index
   * @param attr attribute
   * @param seq the values
   */
  public NoncomputableSequence(final int offset, final String attr, final String seq) {
    super(offset, attr, ZUtils.toZ(seq));
  }

  @Override
  public Z next() {
    ++mN;
    if (mN < size()) {
      return super.next();
    } else {
      throw new UnsupportedOperationException("no further terms known");
    }
  }
}

