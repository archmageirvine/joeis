package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137208.
 * @author Sean A. Irvine
 */
public class A137208 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137208() {
    super(new long[] {-4, 4, 1}, new long[] {2, 3, 6});
  }
}
