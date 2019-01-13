package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163664.
 * @author Sean A. Irvine
 */
public class A163664 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163664() {
    super(new long[] {-1000, 110}, new long[] {110, 10100});
  }
}
