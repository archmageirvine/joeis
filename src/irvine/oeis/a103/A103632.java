package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103632.
 * @author Sean A. Irvine
 */
public class A103632 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103632() {
    super(new long[] {1, 0, 0, 1}, new long[] {1, 0, 1, 1});
  }
}
