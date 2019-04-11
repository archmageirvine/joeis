package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221568 Number of <code>0..3</code> arrays of length n with each element differing from at least one neighbor by something other than 1.
 * @author Sean A. Irvine
 */
public class A221568 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221568() {
    super(new long[] {1, -1, 2, 3}, new long[] {0, 10, 26, 100});
  }
}
