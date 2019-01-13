package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097117.
 * @author Sean A. Irvine
 */
public class A097117 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097117() {
    super(new long[] {4, -1, 2}, new long[] {1, 1, 1});
  }
}
