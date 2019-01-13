package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097075.
 * @author Sean A. Irvine
 */
public class A097075 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097075() {
    super(new long[] {1, 3, 1}, new long[] {1, 0, 2});
  }
}
