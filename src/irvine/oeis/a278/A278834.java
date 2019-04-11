package irvine.oeis.a278;

import irvine.oeis.FiniteSequence;

/**
 * A278834 Record values of A004090(n) <code>- n,</code> where A004090 is the sum of digits of the Fibonacci numbers A000045.
 * @author Georg Fischer
 */
public class A278834 extends FiniteSequence {

  /** Construct the sequence. */
  public A278834() {
    super(0, 2, 6, 8, 15, 30, 32, 40, 44, 46, 51, 57, 92);
  }
}
