package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109377 Expansion of <code>( 2+x+2*x^2 ) / ( 1-2*x+x^2-x^3 )</code>.
 * @author Sean A. Irvine
 */
public class A109377 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109377() {
    super(new long[] {1, -1, 2}, new long[] {2, 5, 10});
  }
}
