package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157622 31250n - 9100.
 * @author Sean A. Irvine
 */
public class A157622 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157622() {
    super(new long[] {-1, 2}, new long[] {22150, 53400});
  }
}
