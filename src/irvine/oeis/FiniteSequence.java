package irvine.oeis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import irvine.math.z.Z;

/**
 * Base case for certain finite sequence generated verbatim from a list.
 * @author Sean A. Irvine
 */
public class FiniteSequence extends ArrayList<Z> implements Sequence {

  private int mN = 0;

  /**
   * Construct an empty sequence.
   */
  public FiniteSequence() {
    super();
  }

  /**
   * Construct the sequence.
   * @param seq the values
   */
  public FiniteSequence(final int... seq) {
    for (final long t : seq) {
      add(Z.valueOf(t));
    }
  }

  /**
   * Construct the sequence.
   * @param seq the values
   */
  public FiniteSequence(final long... seq) {
    for (final long t : seq) {
      add(Z.valueOf(t));
    }
  }

  /**
   * Construct the sequence.
   * @param seq the values
   */
  public FiniteSequence(final Z... seq) {
    super(Arrays.asList(seq));
  }

  /**
   * Construct the sequence.
   * @param seq the values
   */
  public FiniteSequence(final Collection<Z> seq) {
    super(seq);
  }

  @Override
  public Z next() {
    return mN < size() ? get(mN++) : null;
  }

  /**
   * Directly return the specified element of this sequence.
   * @param index index (from 0)
   * @return specified element
   */
  public Z a(final int index) {
    return get(index);
  }

  /**
   * Gets the finite list of terms.
   * @return array of terms
   */
  public Z[] getInitTerms() {
    return toArray(new Z[0]);
  }

}
