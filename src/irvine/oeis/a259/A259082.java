package irvine.oeis.a259;

import irvine.oeis.FiniteSequence;

/**
 * A259082 <code>a(n) =</code> largest k such that the decimal representation of <code>5^k</code> does not contain the digit n, or -1 if every power of 5 contains the digit <code>n</code>.
 * @author Georg Fischer
 */
public class A259082 extends FiniteSequence {

  /** Construct the sequence. */
  public A259082() {
    super(58, 42, 1, 23, 55, -1, 45, 53, 24, 65);
  }
}
