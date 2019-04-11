package irvine.oeis.a155;

import irvine.oeis.FiniteSequence;

/**
 * A155914 Example of <code>an</code> all interval series: the 12 integers 0..11 sorted such that the first differences contain all numbers from 1 to <code>11 (mod 12)</code>.
 * @author Georg Fischer
 */
public class A155914 extends FiniteSequence {

  /** Construct the sequence. */
  public A155914() {
    super(0, 11, 7, 4, 2, 9, 3, 8, 10, 1, 5, 6);
  }
}
