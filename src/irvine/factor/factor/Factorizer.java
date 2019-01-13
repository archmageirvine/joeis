package irvine.factor.factor;

import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Defines a method which can be used to factor numbers.
 *
 * @author Sean A. Irvine
 */
public interface Factorizer {

  /**
   * Given a FactorSequence attempt to further factor any composites
   * or unknowns in the sequence, modifying the factor sequence to
   * reflect any new information.
   *
   * @param fs a factor sequence
   */
  void factor(FactorSequence fs);

  /**
   * Set whether or not to produce extra messages detailing progress
   * as the factorization proceeds.  Such messages should only be
   * produced on standard error.
   *
   * @param verbose true for verbose output
   */
  void setVerbose(boolean verbose);


  /**
   * Test if verbose output is currently turned on.
   *
   * @return true if verbose mode is active
   */
  boolean isVerbose();

  /**
   * Return a completed factor sequence for the given integer.
   *
   * @param n integer to factor
   * @return factor sequence
   * @exception UnsupportedOperationException if factorization cannot be completed
   */
  FactorSequence factorize(final Z n);
}
