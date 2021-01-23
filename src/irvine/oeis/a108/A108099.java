package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108099 a(n) = 8n^2 + 8n + 4.
 * @author Sean A. Irvine
 */
public class A108099 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108099() {
    super(new long[] {1, -3, 3}, new long[] {4, 20, 52});
  }
}
