package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020602 Smallest nonempty set S containing prime divisors of <code>6k+1</code> for each k in S.
 * @author Georg Fischer
 */
public class A020602 extends FiniteSequence {

  /** Construct the sequence. */
  public A020602() {
    super(5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 43, 59, 61, 67, 71, 79, 103, 139, 167, 223, 367, 547, 619, 743, 2203, 13219);
  }
}
