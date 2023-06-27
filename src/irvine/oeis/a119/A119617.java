package irvine.oeis.a119;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A119617 Integers of the form c(n)/b(n) where c(n+1)=c(n)+(n+1)^4 with c(0)=1 and b(n+1)=b(n)+(n+1)^2 with b(0)=1.
 * @author Sean A. Irvine
 */
public class A119617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119617() {
    super(1, new long[] {1, -1, -2, 2, 1}, new long[] {1, 7, 25, 43, 79});
  }
}
