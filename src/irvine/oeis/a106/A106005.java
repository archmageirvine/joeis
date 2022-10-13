package irvine.oeis.a106;

import irvine.oeis.recur.PeriodicSequence;

/**
 * A106005 Fibonacci sequence (mod 15).
 * @author Georg Fischer
 */
public class A106005 extends PeriodicSequence {

  /** Construct the sequence. */
  public A106005() {
    super(0, 1, 1, 2, 3, 5, 8, 13, 6, 4, 10, 14, 9, 8, 2, 10, 12, 7, 4, 11,
      0, 11, 11, 7, 3, 10, 13, 8, 6, 14, 5, 4, 9, 13, 7, 5, 12, 2, 14, 1);
  }
}
