package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097333.
 * @author Sean A. Irvine
 */
public class A097333 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097333() {
    super(new long[] {1, 0, 1}, new long[] {1, 2, 2});
  }
}
