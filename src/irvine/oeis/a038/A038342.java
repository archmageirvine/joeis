package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038342.
 * @author Sean A. Irvine
 */
public class A038342 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038342() {
    super(new long[] {1, -1, -4, 3, 3}, new long[] {1, 3, 12, 41, 146});
  }
}
