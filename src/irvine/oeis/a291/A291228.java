package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291228.
 * @author Sean A. Irvine
 */
public class A291228 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291228() {
    super(new long[] {-1, -2, 4, 2}, new long[] {2, 6, 18, 56});
  }
}
