package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092220.
 * @author Sean A. Irvine
 */
public class A092220 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092220() {
    super(new long[] {-1, 0, 0}, new long[] {0, 1, -1});
  }
}
