package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080938.
 * @author Sean A. Irvine
 */
public class A080938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080938() {
    super(new long[] {-1, 10, -15, 7}, new long[] {1, 1, 2, 5});
  }
}
