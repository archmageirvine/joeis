package irvine.oeis.a094;

import irvine.oeis.FiniteSequence;

/**
 * A094776 a(n) = largest k such that the decimal representation of 2^k does not contain the digit n.
 * @author Georg Fischer
 */
public class A094776 extends FiniteSequence {

  /** Construct the sequence. */
  public A094776() {
    super(86, 91, 168, 153, 107, 71, 93, 71, 78, 108);
  }
}
