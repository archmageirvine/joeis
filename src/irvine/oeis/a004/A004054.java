package irvine.oeis.a004;

import irvine.oeis.RatPolyGfSequence;

/**
 * A004054 Expansion of <code>(1-x)/( (1+x)*(1-2*x)*(1-3*x))</code>.
 * @author Sean A. Irvine
 */
public class A004054 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A004054() {
    super(new long[] {1, -1}, new long[] {1, -4, 1, 6});
  }
}
