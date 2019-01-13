package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003411.
 * @author Sean A. Irvine
 */
public class A003411 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003411() {
    super(new long[] {0, 1, 0, 0, 1}, new long[] {1, 2, 3, 4, 6});
  }
}
