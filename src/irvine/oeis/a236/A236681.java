package irvine.oeis.a236;

import irvine.oeis.FiniteSequence;

/**
 * A236681 Positive integers a such that there exist integers b, c &gt; 0 with 1/a + 1/b + 1/c = 1/2.
 * @author Georg Fischer
 */
public class A236681 extends FiniteSequence {

  /** Construct the sequence. */
  public A236681() {
    super(1, FINITE, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 18, 20, 24, 42);
  }
}
