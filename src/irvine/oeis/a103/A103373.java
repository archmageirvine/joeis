package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103373.
 * @author Sean A. Irvine
 */
public class A103373 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103373() {
    super(new long[] {1, 1, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1});
  }
}
