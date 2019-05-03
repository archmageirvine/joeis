package irvine.oeis.a074;

import irvine.oeis.FiniteSequence;

/**
 * A074164 Smallest k such that <code>R(k) &gt; n*k</code>, where <code>R(k)</code> is the digit reversal of k <code>(A004086)</code> (the reversal of 10 is taken to be <code>01 = 1, etc.)</code>.
 * @author Georg Fischer
 */
public class A074164 extends FiniteSequence {

  /** Construct the sequence. */
  public A074164() {
    super(12, 13, 15, 17, 106, 107, 108, 109, 1099);
  }
}
