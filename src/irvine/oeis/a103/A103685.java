package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103685.
 * @author Sean A. Irvine
 */
public class A103685 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103685() {
    super(new long[] {-2, 6, -8, 5}, new long[] {0, 0, 1, 5});
  }
}
