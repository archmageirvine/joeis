package irvine.oeis.a125;

import irvine.oeis.FiniteSequence;

/**
 * A125724 If <code>"sumdigit"</code> denotes the sum of the digits of a number then these are the numbers n such that <code>n=sumdigit(sumdigit(n)^sumdigit(n))</code>.
 * @author Georg Fischer
 */
public class A125724 extends FiniteSequence {

  /** Construct the sequence. */
  public A125724() {
    super(1, 13, 25, 45, 58, 88, 98);
  }
}
