package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291383.
 * @author Sean A. Irvine
 */
public class A291383 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291383() {
    super(new long[] {2, 4, 4, 2}, new long[] {2, 8, 28, 98});
  }
}
