package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261054 Expansion of <code>( 2+x-x^2+x^3 ) / (1-x^2-x)^3 </code>.
 * @author Sean A. Irvine
 */
public class A261054 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261054() {
    super(new long[] {1, 3, 0, -5, 0, 3}, new long[] {2, 7, 20, 51, 118, 260});
  }
}
