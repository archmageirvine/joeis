package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245367.
 * @author Sean A. Irvine
 */
public class A245367 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245367() {
    super(new long[] {1, 0, 1, 0, 1, 0, 0}, new long[] {1, 0, 0, 1, 0, 1, 1});
  }
}
