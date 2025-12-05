package irvine.oeis.a390;

import irvine.oeis.FiniteSequence;

/**
 * A390943 Entries that keep growing, in the map initialized with T[1] = 1 and subsequently updated using T[v] := k + (T[v] if defined else 0), for all key-value pairs (k,v) in the map T at a given iteration.
 * @author Sean A. Irvine
 */
public class A390943 extends FiniteSequence {

  /** Construct the sequence. */
  public A390943() {
    super(1, FINITE, 1, 2, 4, 24, 28, 30, 32, 64, 88, 128, 132, 134, 268, 416, 1920, 3712, 7424);
  }
}
