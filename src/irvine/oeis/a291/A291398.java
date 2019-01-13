package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291398.
 * @author Sean A. Irvine
 */
public class A291398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291398() {
    super(new long[] {1, 3, 4, 3, 1, 0}, new long[] {0, 1, 3, 5, 9, 19});
  }
}
