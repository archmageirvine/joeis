package irvine.oeis.a267;

import irvine.oeis.FiniteSequence;

/**
 * A267647 a(n) = g_n(4), where g is the weak Goodstein function defined in A266202.
 * @author Georg Fischer
 */
public class A267647 extends FiniteSequence {

  /** Construct the sequence. */
  public A267647() {
    super(4, 8, 9, 10, 11, 11, 11, 11, 11, 11, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0);
  }
}
