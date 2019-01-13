package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291385.
 * @author Sean A. Irvine
 */
public class A291385 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291385() {
    super(new long[] {-4, -8, 0, 4}, new long[] {1, 4, 14, 47});
  }
}
