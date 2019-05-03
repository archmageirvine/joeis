package irvine.oeis.a052;

import irvine.oeis.FiniteSequence;

/**
 * A052023 Every suffix of palindromic prime <code>a(n)</code>, containing no <code>'0'</code> digit, is prime <code>(left-truncatable</code> palindromic <code>primes)</code>.
 * @author Georg Fischer
 */
public class A052023 extends FiniteSequence {

  /** Construct the sequence. */
  public A052023() {
    super(2, 3, 5, 7, 313, 353, 373, 383, 797, 76367, 79397, 7693967, 799636997L);
  }
}
