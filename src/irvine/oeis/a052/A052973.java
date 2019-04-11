package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052973 Expansion of <code>( 1-x ) / ( 1-x-3*x^2+x^3 )</code>.
 * @author Sean A. Irvine
 */
public class A052973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052973() {
    super(new long[] {-1, 3, 1}, new long[] {1, 0, 3});
  }
}
