package irvine.oeis.a242;

import irvine.oeis.FiniteSequence;

/**
 * A242808 The smallest n-digit number where first k digits are divisible by k-th Fibonacci number for k <code>= 1</code>..n.
 * @author Georg Fischer
 */
public class A242808 extends FiniteSequence {

  /** Construct the sequence. */
  public A242808() {
    super(1, 10, 100, 1002, 10020, 100200, 1002001, 10050432, 100552416L, 1023529540L, 15035286200L);
  }
}
