package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017319.
 * @author Sean A. Irvine
 */
public class A017319 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017319() {
    super(new long[] {-1, 4, -6, 4}, new long[] {64, 2744, 13824, 39304});
  }
}
