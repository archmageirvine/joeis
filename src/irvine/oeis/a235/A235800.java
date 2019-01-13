package irvine.oeis.a235;

import irvine.oeis.LinearRecurrence;

/**
 * A235800.
 * @author Sean A. Irvine
 */
public class A235800 extends LinearRecurrence {

  /** Construct the sequence. */
  public A235800() {
    super(new long[] {-1, 0, 2, 0}, new long[] {3, 1, 7, 2});
  }
}
