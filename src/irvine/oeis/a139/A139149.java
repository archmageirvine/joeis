package irvine.oeis.a139;
// manually 

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A139149 a(n) = (n!+2)/2.
 * @author Georg Fischer
 */
public class A139149 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A139149() {
    this(2, 2);
  }
  
  /**
   * Generic constructor with parameter 
   * @param offset first index
   * @param init initial term
   */
  public A139149(final int offset, final int init) {
    super(offset, "[[1,-1],[0, 1],[-1]]", String.valueOf(init), 0);
  }
}
