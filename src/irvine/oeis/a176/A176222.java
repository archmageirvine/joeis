package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176222.
 * @author Sean A. Irvine
 */
public class A176222 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176222() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 3, 5, 10});
  }
}
