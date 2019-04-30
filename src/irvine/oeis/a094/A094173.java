package irvine.oeis.a094;

import irvine.oeis.FiniteSequence;

/**
 * A094173 <code>a(n) =</code> m if m has already occurred at least once and n=k+i*(m+1) where k is the index of the first occurrence of n and <code>i=1,...,max(n-1,1)</code>, otherwise <code>a(n) =</code> least positive integer that has not yet occurred.
 * @author Georg Fischer
 */
public class A094173 extends FiniteSequence {

  /** Construct the sequence. */
  public A094173() {
    super(1, 2, 1, 3, 2, 4, 5, 3, 6, 7, 4, 3, 5, 8, 9);
  }
}
