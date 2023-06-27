package irvine.oeis.a179;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A179441 Number of solutions to a+b+c &lt; d+e with each of a,b,c,d,e in {1..n+1}.
 * @author Sean A. Irvine
 */
public class A179441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179441() {
    super(1, new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 21, 121, 432, 1182, 2723});
  }
}
