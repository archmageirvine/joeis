package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080860.
 * @author Sean A. Irvine
 */
public class A080860 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080860() {
    super(new long[] {1, -3, 3}, new long[] {1, 16, 51});
  }
}
