package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103378.
 * @author Sean A. Irvine
 */
public class A103378 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103378() {
    super(new long[] {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
