package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141385.
 * @author Sean A. Irvine
 */
public class A141385 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141385() {
    super(new long[] {1, -9, 7}, new long[] {3, 7, 31});
  }
}
