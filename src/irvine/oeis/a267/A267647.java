package irvine.oeis.a267;

import irvine.oeis.FiniteSequence;

/**
 * A267647 <code>a(n) = g_n(4)</code>, where g is the weak Goodstein function defined in <code>A266202</code>.
 * @author Georg Fischer
 */
public class A267647 extends FiniteSequence {

  /** Construct the sequence. */
  public A267647() {
    super(4, 8, 9, 10, 11, 11, 11, 11, 11, 11, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0);
  }
}
