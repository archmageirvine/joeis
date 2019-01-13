package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140066.
 * @author Sean A. Irvine
 */
public class A140066 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140066() {
    super(new long[] {1, -3, 3}, new long[] {1, 3, 10});
  }
}
