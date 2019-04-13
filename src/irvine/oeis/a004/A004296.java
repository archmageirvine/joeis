package irvine.oeis.a004;

import irvine.oeis.RatPolyGfSequence;

/**
 * A004296 Expansion of <code>(1+2*x+x^2)/(1-50*x+x^2)</code>.
 * @author Sean A. Irvine
 */
public class A004296 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A004296() {
    super(new long[] {1, 2, 1}, new long[] {1, -50, 1});
  }
}
