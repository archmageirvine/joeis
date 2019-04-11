package irvine.oeis.a272;

import irvine.oeis.FiniteSequence;

/**
 * A272341 Numbers n such that <code>6^n</code> is not of the form <code>(x^3 +</code> y^3 + z^3) <code>/ 3</code> where <code>x &gt;</code> y &gt; z <code>&gt; 0</code>.
 * @author Georg Fischer
 */
public class A272341 extends FiniteSequence {

  /** Construct the sequence. */
  public A272341() {
    super(0, 1, 2, 3, 5, 6, 8, 9, 12, 15);
  }
}
