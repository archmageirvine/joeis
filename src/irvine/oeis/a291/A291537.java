package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291537.
 * @author Sean A. Irvine
 */
public class A291537 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291537() {
    super(new long[] {16, -26, 11}, new long[] {7, 57, 493});
  }
}
