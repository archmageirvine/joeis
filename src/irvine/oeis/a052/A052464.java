package irvine.oeis.a052;

import irvine.oeis.FiniteSequence;

/**
 * A052464 Fixed points for operation of repeatedly replacing a number with the sum of the fifth power of its digits.
 * @author Georg Fischer
 */
public class A052464 extends FiniteSequence {

  /** Construct the sequence. */
  public A052464() {
    super(1, FINITE, 0, 1, 4150, 4151, 54748, 92727, 93084, 194979);
  }
}
