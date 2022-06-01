package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052986 Expansion of ( 1-2*x ) / ( (x-1)*(2*x^2+3*x-1) ).
 * @author Sean A. Irvine
 */
public class A052986 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052986() {
    super(new long[] {-2, -1, 4}, new long[] {1, 2, 7});
  }
}
