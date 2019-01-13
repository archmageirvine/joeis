package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226309.
 * @author Sean A. Irvine
 */
public class A226309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226309() {
    super(new long[] {2, 1, 1, 1}, new long[] {2, 1, 5, 10});
  }
}
