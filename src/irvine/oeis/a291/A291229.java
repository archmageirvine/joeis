package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291229.
 * @author Sean A. Irvine
 */
public class A291229 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291229() {
    super(new long[] {-1, -3, 0, 3}, new long[] {3, 7, 18, 45});
  }
}
