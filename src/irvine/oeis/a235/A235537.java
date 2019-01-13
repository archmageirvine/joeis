package irvine.oeis.a235;

import irvine.oeis.LinearRecurrence;

/**
 * A235537.
 * @author Sean A. Irvine
 */
public class A235537 extends LinearRecurrence {

  /** Construct the sequence. */
  public A235537() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {6, 19, 23, 41, 49});
  }
}
