package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089598.
 * @author Sean A. Irvine
 */
public class A089598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089598() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {1, 0, 1, 3, 0, 2});
  }
}
