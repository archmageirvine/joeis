package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261056 Expansion of <code>( 2-x^2 ) / (x^2+2*x-1)^2 </code>.
 * @author Sean A. Irvine
 */
public class A261056 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261056() {
    super(new long[] {-1, -4, -2, 4}, new long[] {2, 8, 27, 84});
  }
}
