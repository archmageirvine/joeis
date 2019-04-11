package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245906 Numbers of the form <code>4n^2 + 1</code> or <code>4n^2 + 8n + 1</code>.
 * @author Sean A. Irvine
 */
public class A245906 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245906() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {5, 13, 17, 33, 37});
  }
}
