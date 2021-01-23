package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111954 a(n) = A000129(n) + (-1)^n.
 * @author Sean A. Irvine
 */
public class A111954 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111954() {
    super(new long[] {1, 3, 1}, new long[] {1, 0, 3});
  }
}
