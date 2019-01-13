package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158773.
 * @author Sean A. Irvine
 */
public class A158773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158773() {
    super(new long[] {1, -3, 3}, new long[] {1560, 6360, 14360});
  }
}
