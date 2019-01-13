package irvine.oeis.a268;

import irvine.oeis.LinearRecurrence;

/**
 * A268896.
 * @author Sean A. Irvine
 */
public class A268896 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268896() {
    super(new long[] {-2, 0, 0, 3, 0, 0}, new long[] {1, 3, 5, 6, 8, 10});
  }
}
