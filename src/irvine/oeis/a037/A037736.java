package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037736.
 * @author Sean A. Irvine
 */
public class A037736 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037736() {
    super(new long[] {-10, 1, 0, 0, 10}, new long[] {2, 21, 210, 2103, 21032});
  }
}
