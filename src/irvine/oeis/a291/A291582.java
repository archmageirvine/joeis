package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291582.
 * @author Sean A. Irvine
 */
public class A291582 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291582() {
    super(new long[] {1, -3, 3}, new long[] {30, 132, 306});
  }
}
