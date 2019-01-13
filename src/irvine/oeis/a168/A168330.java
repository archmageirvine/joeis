package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168330.
 * @author Sean A. Irvine
 */
public class A168330 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168330() {
    super(new long[] {1, 0}, new long[] {3, -2});
  }
}
