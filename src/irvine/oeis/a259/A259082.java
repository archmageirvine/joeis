package irvine.oeis.a259;

import irvine.oeis.FiniteSequence;

/**
 * A259082 <code>a(n) =</code> largest k such that the decimal representation of 5^k does not contain the digit <code>n,</code> or <code>-1</code> if every power of 5 contains the digit n.
 * @author Georg Fischer
 */
public class A259082 extends FiniteSequence {

  /** Construct the sequence. */
  public A259082() {
    super(58, 42, 1, 23, 55, -1, 45, 53, 24, 65);
  }
}
