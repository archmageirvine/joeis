package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120771 Expansion of <code>( 1-x^3+x^4+x^5-x^8 ) / ( 1-2*x^3-x^6+x^9 )</code>.
 * @author Sean A. Irvine
 */
public class A120771 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120771() {
    super(new long[] {-1, 0, 0, 1, 0, 0, 2, 0, 0}, new long[] {1, 0, 0, 1, 1, 1, 3, 2, 1});
  }
}
