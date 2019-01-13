package irvine.oeis.a258;

import irvine.oeis.LinearRecurrence;

/**
 * A258841.
 * @author Sean A. Irvine
 */
public class A258841 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258841() {
    super(new long[] {1, -3, 3}, new long[] {1927, 1699, 1489});
  }
}
