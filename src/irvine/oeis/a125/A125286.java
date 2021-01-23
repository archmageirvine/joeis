package irvine.oeis.a125;

import irvine.oeis.FiniteSequence;

/**
 * A125286 a(0)=1. a(n) = a(n-1) + (the largest term among {a(0),a(1),...a(n-1)} that has the same number of positive divisors as n).
 * @author Georg Fischer
 */
public class A125286 extends FiniteSequence {

  /** Construct the sequence. */
  public A125286() {
    super(1, 2, 4, 6, 10, 12, 22, 24, 46, 50, 96, 98, 196, 198, 244, 290);
  }
}
