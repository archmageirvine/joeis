package irvine.oeis.a259;

import irvine.oeis.FiniteSequence;

/**
 * A259083 <code>a(n) =</code> largest k such that the decimal representation of <code>7^k</code> does not contain the digit <code>n</code>.
 * @author Georg Fischer
 */
public class A259083 extends FiniteSequence {

  /** Construct the sequence. */
  public A259083() {
    super(35, 30, 28, 20, 29, 25, 33, 39, 33, 61);
  }
}
