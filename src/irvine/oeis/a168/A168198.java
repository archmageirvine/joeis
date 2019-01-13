package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168198.
 * @author Sean A. Irvine
 */
public class A168198 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168198() {
    super(new long[] {-1, 1, 1}, new long[] {1, 6, 4});
  }
}
