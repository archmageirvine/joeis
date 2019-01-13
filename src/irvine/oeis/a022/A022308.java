package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022308.
 * @author Sean A. Irvine
 */
public class A022308 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022308() {
    super(new long[] {-1, 0, 2}, new long[] {0, 3, 4});
  }
}
