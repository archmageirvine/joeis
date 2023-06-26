package irvine.oeis.a296;

import irvine.oeis.FiniteSequence;

/**
 * A296378 Fibonacci numbers that can be expressed as a sum of two or more Fibonacci numbers such that no digit appears more than once in the equation.
 * @author Georg Fischer
 */
public class A296378 extends FiniteSequence {

  /** Construct the sequence. */
  public A296378() {
    super(1, FINITE, 3, 5, 8, 13, 34);
  }
}
