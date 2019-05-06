package irvine.oeis.a233;

import irvine.oeis.FiniteSequence;

/**
 * A233181 Highly composite numbers of the form <code>x^2 + xy + y^2</code>.
 * @author Georg Fischer
 */
public class A233181 extends FiniteSequence {

  /** Construct the sequence. */
  public A233181() {
    super(1, 4, 12, 36, 48, 25200);
  }
}
