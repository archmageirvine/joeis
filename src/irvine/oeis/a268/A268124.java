package irvine.oeis.a268;

import irvine.oeis.FiniteSequence;

/**
 * A268124 a(n) = n^4 * (n+3)^6 * 4^(-n).
 * @author Georg Fischer
 */
public class A268124 extends FiniteSequence {

  /** Construct the sequence. */
  public A268124() {
    super(0, 1024, 15625, 59049, 117649, 160000);
  }
}
