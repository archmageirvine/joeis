package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052989 Expansion of ( 1-x ) / ( 1-x-x^2-x^4+x^5 ).
 * @author Sean A. Irvine
 */
public class A052989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052989() {
    super(new long[] {-1, 1, 0, 1, 1}, new long[] {1, 0, 1, 1, 3});
  }
}
