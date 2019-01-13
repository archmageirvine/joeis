package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168333.
 * @author Sean A. Irvine
 */
public class A168333 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168333() {
    super(new long[] {-1, 1, 1}, new long[] {2, 9, 9});
  }
}
