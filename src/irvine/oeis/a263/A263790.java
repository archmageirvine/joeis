package irvine.oeis.a263;

import irvine.oeis.LinearRecurrence;

/**
 * A263790.
 * @author Sean A. Irvine
 */
public class A263790 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263790() {
    super(new long[] {-1, 2, -2, 4}, new long[] {1, 1, 2, 6});
  }
}
