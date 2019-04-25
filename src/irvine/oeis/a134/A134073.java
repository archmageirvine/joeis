package irvine.oeis.a134;

import irvine.oeis.FiniteSequence;

/**
 * A134073 Complete list of solutions to <code>y^2 = x^3 + 73</code>; sequence gives y values.
 * @author Georg Fischer
 */
public class A134073 extends FiniteSequence {

  /** Construct the sequence. */
  public A134073() {
    super(3, 9, 10, 17, 611, 6717);
  }
}
