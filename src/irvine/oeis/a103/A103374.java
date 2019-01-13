package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103374.
 * @author Sean A. Irvine
 */
public class A103374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103374() {
    super(new long[] {1, 1, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1, 1});
  }
}
