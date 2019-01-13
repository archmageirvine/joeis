package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028403.
 * @author Sean A. Irvine
 */
public class A028403 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028403() {
    super(new long[] {-8, 6}, new long[] {4, 12});
  }
}
