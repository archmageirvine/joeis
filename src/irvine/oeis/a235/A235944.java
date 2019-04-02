package irvine.oeis.a235;

import irvine.oeis.LinearRecurrence;

/**
 * A235944 Digital roots of squares of Lucas numbers.
 * @author Sean A. Irvine
 */
public class A235944 extends LinearRecurrence {

  /** Construct the sequence. */
  public A235944() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {4, 1, 9, 7, 4, 4, 9, 4, 4, 7, 9, 1});
  }
}
