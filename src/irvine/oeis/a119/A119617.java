package irvine.oeis.a119;

import irvine.oeis.LinearRecurrence;

/**
 * A119617 Integers of the form <code>c(n)/b(n)</code> where <code>c(n+1)=c(n)+(n+1)^4</code> with <code>c(0)=1</code> and <code>b(n+1)=b(n)+(n+1)^2</code> with <code>b(0)=1</code>.
 * @author Sean A. Irvine
 */
public class A119617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119617() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 7, 25, 43, 79});
  }
}
