package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020712 Pisot sequences E(5,8), P(5,8).
 * @author Sean A. Irvine
 */
public class A020712 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020712() {
    super(new long[] {1, 1}, new long[] {5, 8});
  }
}
