package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084104 A period 6 sequence.
 * @author Sean A. Irvine
 */
public class A084104 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084104() {
    super(new long[] {1, -2, 2}, new long[] {1, 4, 7});
  }
}
