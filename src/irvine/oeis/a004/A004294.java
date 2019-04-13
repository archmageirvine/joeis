package irvine.oeis.a004;

import irvine.oeis.RatPolyGfSequence;

/**
 * A004294 Expansion of <code>(1+2*x+x^2)/(1-34*x+x^2)</code>.
 * @author Sean A. Irvine
 */
public class A004294 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A004294() {
    super(new long[] {1, 2, 1}, new long[] {1, -34, 1});
  }
}
