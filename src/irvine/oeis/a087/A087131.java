package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087131 <code>a(n) = 2^n*Lucas(n)</code>, where Lucas = A000032.
 * @author Sean A. Irvine
 */
public class A087131 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087131() {
    super(new long[] {4, 2}, new long[] {2, 2});
  }
}
