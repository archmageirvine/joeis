package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177060.
 * @author Sean A. Irvine
 */
public class A177060 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177060() {
    super(new long[] {1, -3, 3}, new long[] {10, 108, 304});
  }
}
