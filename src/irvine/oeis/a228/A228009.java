package irvine.oeis.a228;

import irvine.oeis.FiniteSequence;

/**
 * A228009 The number of n-digit numbers where first k digits are divisible by k^2 for k = 1..n.
 * @author Georg Fischer
 */
public class A228009 extends FiniteSequence {

  /** Construct the sequence. */
  public A228009() {
    super(9, 22, 24, 16, 7, 7, 1);
  }
}
