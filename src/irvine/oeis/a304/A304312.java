package irvine.oeis.a304;
// manually deris/essent at 2023-03-24 13:24

import irvine.oeis.PrependSequence;
import irvine.oeis.a006.A006691;

/**
 * A304312 Logarithmic derivative of F(x) that satisfies: [x^n] exp( n^2 * x ) / F(x) = 0 for n&gt;0.
 * @author Georg Fischer
 */
public class A304312 extends PrependSequence {

  /** Construct the sequence. */
  public A304312() {
    super(1, new A006691(), 1, 9);
  }
}
