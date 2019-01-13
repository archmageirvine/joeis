package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111216.
 * @author Sean A. Irvine
 */
public class A111216 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111216() {
    super(new long[] {-1, 31}, new long[] {1, 30});
  }
}
