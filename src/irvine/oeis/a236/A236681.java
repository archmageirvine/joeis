package irvine.oeis.a236;

import irvine.oeis.FiniteSequence;

/**
 * A236681 Positive integers a such that there exist integers <code>b,</code> c <code>&gt; 0</code> with <code>1/a + 1/b +</code> 1/c <code>= 1/2</code>.
 * @author Georg Fischer
 */
public class A236681 extends FiniteSequence {

  /** Construct the sequence. */
  public A236681() {
    super(3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 18, 20, 24, 42);
  }
}
