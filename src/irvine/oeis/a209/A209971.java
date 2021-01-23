package irvine.oeis.a209;

import irvine.oeis.LinearRecurrence;

/**
 * A209971 a(n) = A000129(n) + n.
 * @author Sean A. Irvine
 */
public class A209971 extends LinearRecurrence {

  /** Construct the sequence. */
  public A209971() {
    super(new long[] {1, 0, -4, 4}, new long[] {0, 2, 4, 8});
  }
}
