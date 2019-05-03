package irvine.oeis.a038;

import irvine.oeis.FiniteSequence;

/**
 * A038178 <code>n =</code> (sum of digits of <code>n)^(number</code> of digits of <code>n)</code>.
 * @author Georg Fischer
 */
public class A038178 extends FiniteSequence {

  /** Construct the sequence. */
  public A038178() {
    super(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 81, 512, 2401);
  }
}
