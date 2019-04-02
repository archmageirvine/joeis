package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138614 Expansion of (2*x-1)*(x^2-x-1) ) / ( 1-2*x^2+2*x^4 ).
 * @author Sean A. Irvine
 */
public class A138614 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138614() {
    super(new long[] {-2, 0, 2, 0}, new long[] {1, -1, -1, 0});
  }
}
