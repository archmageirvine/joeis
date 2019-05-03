package irvine.oeis.a074;

import irvine.oeis.FiniteSequence;

/**
 * A074163 Smallest k, not divisible by 10, such that <code>R(k) &gt; n*k</code>, where <code>R(k)</code> is the digit reversal of k <code>(A004086)</code>.
 * @author Georg Fischer
 */
public class A074163 extends FiniteSequence {

  /** Construct the sequence. */
  public A074163() {
    super(12, 13, 15, 17, 19, 107, 108, 109);
  }
}
