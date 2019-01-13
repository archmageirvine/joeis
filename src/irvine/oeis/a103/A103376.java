package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103376.
 * @author Sean A. Irvine
 */
public class A103376 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103376() {
    super(new long[] {1, 1, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
