package irvine.oeis.a102;

import irvine.oeis.FiniteSequence;

/**
 * A102717 "Lightest" sequence built with one "1", two "2", three "3", <code>...,</code> nine "9" (and no "0"). The weight of such a sequence is the total sum of its integers [the sequence is finite, by definition and <code>a(n+1)</code> must be <code>&gt; a(n)]</code>.
 * @author Georg Fischer
 */
public class A102717 extends FiniteSequence {

  /** Construct the sequence. */
  public A102717() {
    super(5, 6, 7, 8, 9, 19, 28, 29, 37, 38, 39, 46, 47, 48, 49, 56, 57, 58, 59, 67, 68, 69, 78, 79, 89);
  }
}
