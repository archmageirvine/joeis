package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168202.
 * @author Sean A. Irvine
 */
public class A168202 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168202() {
    super(new long[] {-1, 1, 1}, new long[] {5, 2, 8});
  }
}
