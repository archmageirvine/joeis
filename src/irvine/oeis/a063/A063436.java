package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063436.
 * @author Sean A. Irvine
 */
public class A063436 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063436() {
    super(new long[] {1, -3, 3}, new long[] {0, 15, 54});
  }
}
