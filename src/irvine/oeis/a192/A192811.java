package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192811 a(n) = A192809(n)/2.
 * @author Sean A. Irvine
 */
public class A192811 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192811() {
    super(new long[] {8, -12, 7}, new long[] {0, 0, 1});
  }
}
