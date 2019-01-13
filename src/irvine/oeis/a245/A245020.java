package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245020.
 * @author Sean A. Irvine
 */
public class A245020 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245020() {
    super(new long[] {120, -74, 15}, new long[] {0, 2, 30});
  }
}
