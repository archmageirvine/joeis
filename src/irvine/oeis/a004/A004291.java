package irvine.oeis.a004;

import irvine.oeis.RatPolyGfSequence;

/**
 * A004291 Expansion of <code>(1+2*x+x^2)/(1-10*x+x^2)</code>.
 * @author Sean A. Irvine
 */
public class A004291 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A004291() {
    super(new long[] {1, 2, 1}, new long[] {1, -10, 1});
  }
}
