package irvine.oeis.a259;

import irvine.oeis.FiniteSequence;

/**
 * A259083 a(n) = largest k such that the decimal representation of 7^k does not contain the digit n.
 * @author Georg Fischer
 */
public class A259083 extends FiniteSequence {

  /** Construct the sequence. */
  public A259083() {
    super(35, 30, 28, 20, 29, 25, 33, 39, 33, 61);
  }
}
