package irvine.oeis.a246;

import irvine.oeis.LinearRecurrence;

/**
 * A246638.
 * @author Sean A. Irvine
 */
public class A246638 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246638() {
    super(new long[] {1, -4, 4}, new long[] {5, 8, 17});
  }
}
