package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161532 <code>a(n) = 2n^2 + 8n + 1</code>.
 * @author Sean A. Irvine
 */
public class A161532 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161532() {
    super(new long[] {1, -3, 3}, new long[] {1, 11, 25});
  }
}
