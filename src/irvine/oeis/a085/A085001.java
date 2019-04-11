package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085001 <code>a(n) = (3*n+1)*(3*n+4)</code>.
 * @author Sean A. Irvine
 */
public class A085001 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085001() {
    super(new long[] {1, -3, 3}, new long[] {4, 28, 70});
  }
}
