package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128130 Expansion of <code>(1-x)/(1+x^4)</code>; Period 8: repeat <code>[1,-1,0,0,-1,1,0,0]</code>.
 * @author Sean A. Irvine
 */
public class A128130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128130() {
    super(new long[] {-1, 0, 0, 0}, new long[] {1, -1, 0, 0});
  }
}
