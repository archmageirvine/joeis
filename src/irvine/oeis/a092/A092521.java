package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092521.
 * @author Sean A. Irvine
 */
public class A092521 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092521() {
    super(new long[] {1, -8, 8}, new long[] {1, 8, 56});
  }
}
