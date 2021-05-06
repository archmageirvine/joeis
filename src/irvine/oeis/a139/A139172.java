package irvine.oeis.a139;
// manually 

import irvine.oeis.HolonomicRecurrence;

/**
 * A139172 Natural numbers of the form (n!-2)/2.
 * @author Georg Fischer
 */
public class A139172 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A139172() {
    this(2, 0);
  }
  
  /**
   * Generic constructor with parameter 
   * @param offset first index
   * @param init initial term
   */
  public A139172(final int offset, final int init) {
    super(offset, "[[-1, 1],[0, 1],[-1]]", String.valueOf(init), 0);
  }
}
