package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008818 Expansion of <code>(1+2*x^3+x^4)/((1-x^2)^2*(1-x^4));</code> Molien series for 3-dimensional representation of group <code>2x = [ 2+,4+ ] = CC_4 = C4</code>.
 * @author Sean A. Irvine
 */
public class A008818 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008818() {
    super(new long[] {1, 0, 0, 2, 1}, new int[] {2, 2, 4});
  }
}

