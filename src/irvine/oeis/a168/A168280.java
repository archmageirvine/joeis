package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168280.
 * @author Sean A. Irvine
 */
public class A168280 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168280() {
    super(new long[] {-1, 1, 1}, new long[] {4, 4, 9});
  }
}
