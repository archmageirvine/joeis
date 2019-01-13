package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028881.
 * @author Sean A. Irvine
 */
public class A028881 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028881() {
    super(new long[] {1, -3, 3}, new long[] {2, 9, 18});
  }
}
