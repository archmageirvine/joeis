package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052982 Expansion of ( 1-x ) / ( 1-2*x-2*x^2+x^4 ).
 * @author Sean A. Irvine
 */
public class A052982 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052982() {
    super(new long[] {-1, 0, 2, 2}, new long[] {1, 1, 4, 10});
  }
}
