package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125857 Numbers whose base-9 representation is 22222222.......2.
 * @author Sean A. Irvine
 */
public class A125857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125857() {
    super(new long[] {-9, 10}, new long[] {0, 2});
  }
}
