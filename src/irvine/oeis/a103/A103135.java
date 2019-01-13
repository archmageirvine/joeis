package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103135.
 * @author Sean A. Irvine
 */
public class A103135 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103135() {
    super(new long[] {3, 0, -5, 4}, new long[] {1, -10, -27, -55});
  }
}
