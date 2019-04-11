package irvine.oeis.a278;

import irvine.oeis.FiniteSequence;

/**
 * A278833 Indices of records of A004090(n) <code>- n,</code> where A004090 is the sum of digits of the Fibonacci numbers A000045.
 * @author Georg Fischer
 */
public class A278833 extends FiniteSequence {

  /** Construct the sequence. */
  public A278833() {
    super(0, 6, 11, 16, 58, 178, 195, 273, 695, 862, 989, 2477, 2619);
  }
}
