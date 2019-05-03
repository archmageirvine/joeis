package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125823 Numbers whose base 7 representation is 4444....4.
 * @author Sean A. Irvine
 */
public class A125823 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125823() {
    super(new long[] {-7, 8}, new long[] {0, 4});
  }
}
