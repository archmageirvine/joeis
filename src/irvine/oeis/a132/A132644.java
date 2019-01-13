package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132644.
 * @author Sean A. Irvine
 */
public class A132644 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132644() {
    super(new long[] {1, -1299, 1299}, new long[] {0, 324, 421200});
  }
}
