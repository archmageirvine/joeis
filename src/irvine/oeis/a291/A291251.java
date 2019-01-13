package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291251.
 * @author Sean A. Irvine
 */
public class A291251 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291251() {
    super(new long[] {1, 0, -6, -2, 6, 0}, new long[] {0, 3, -2, 15, -18, 76});
  }
}
