package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019671.
 * @author Sean A. Irvine
 */
public class A019671 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019671() {
    super(new long[] {320, -152, 22}, new long[] {1, 22, 332});
  }
}
