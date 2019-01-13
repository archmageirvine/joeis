package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092808.
 * @author Sean A. Irvine
 */
public class A092808 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092808() {
    super(new long[] {4, 4, -1}, new long[] {1, 0, 3});
  }
}
