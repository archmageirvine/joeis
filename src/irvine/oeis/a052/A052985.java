package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052985 Expansion of <code>( 1-x ) / ( 1-3*x+x^2-x^3+x^4 )</code>.
 * @author Sean A. Irvine
 */
public class A052985 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052985() {
    super(new long[] {-1, 1, -1, 3}, new long[] {1, 2, 5, 14});
  }
}
