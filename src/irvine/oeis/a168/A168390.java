package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168390.
 * @author Sean A. Irvine
 */
public class A168390 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168390() {
    super(new long[] {-1, 1, 1}, new long[] {1, 9, 9});
  }
}
