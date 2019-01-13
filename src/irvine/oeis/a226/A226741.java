package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226741.
 * @author Sean A. Irvine
 */
public class A226741 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226741() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {75, 308, 807, 1704, 3155});
  }
}
