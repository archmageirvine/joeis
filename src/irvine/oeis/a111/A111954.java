package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111954.
 * @author Sean A. Irvine
 */
public class A111954 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111954() {
    super(new long[] {1, 3, 1}, new long[] {1, 0, 3});
  }
}
