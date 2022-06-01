package irvine.oeis.a086;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A086652 a(n) = A000225(n+3)-A052955(n).
 * @author Sean A. Irvine
 */
public class A086652 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086652() {
    super(new long[] {-4, 2, 2}, new long[] {6, 13, 28});
  }
}
