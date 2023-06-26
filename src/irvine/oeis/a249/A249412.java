package irvine.oeis.a249;

import irvine.oeis.FiniteSequence;

/**
 * A249412 Cardinalities of finite fields without three consecutive primitive elements.
 * @author Georg Fischer
 */
public class A249412 extends FiniteSequence {

  /** Construct the sequence. */
  public A249412() {
    super(1, FINITE, 3, 5, 7, 9, 13, 25, 29, 61, 81, 121, 169);
  }
}
