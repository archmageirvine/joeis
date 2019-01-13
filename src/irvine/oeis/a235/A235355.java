package irvine.oeis.a235;

import irvine.oeis.LinearRecurrence;

/**
 * A235355.
 * @author Sean A. Irvine
 */
public class A235355 extends LinearRecurrence {

  /** Construct the sequence. */
  public A235355() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {0, 1, 2, 7, 11, 24, 33});
  }
}
