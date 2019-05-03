package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253368 <code>a(n) = F(12*n)/(12^2)</code> with the Fibonacci numbers F <code>= A000045</code>.
 * @author Sean A. Irvine
 */
public class A253368 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253368() {
    super(new long[] {-1, 322}, new long[] {1, 322});
  }
}
