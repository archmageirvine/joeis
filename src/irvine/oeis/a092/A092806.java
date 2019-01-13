package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092806.
 * @author Sean A. Irvine
 */
public class A092806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092806() {
    super(new long[] {1001, -3, 3}, new long[] {1, 11, 21});
  }
}
