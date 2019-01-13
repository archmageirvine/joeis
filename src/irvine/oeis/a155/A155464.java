package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155464.
 * @author Sean A. Irvine
 */
public class A155464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155464() {
    super(new long[] {1, -7, 7}, new long[] {0, 51, 340});
  }
}
