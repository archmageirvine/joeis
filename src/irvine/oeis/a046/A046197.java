package irvine.oeis.a046;

import irvine.oeis.FiniteSequence;

/**
 * A046197 Fixed points for operation of repeatedly replacing a number with the sum of the cubes of its digits.
 * @author Georg Fischer
 */
public class A046197 extends FiniteSequence {

  /** Construct the sequence. */
  public A046197() {
    super(0, 1, 153, 370, 371, 407);
  }
}
