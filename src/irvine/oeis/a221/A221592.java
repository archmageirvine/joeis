package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221592 Number of <code>0..4</code> arrays of length n with each element differing from at least one neighbor by 1 or less.
 * @author Sean A. Irvine
 */
public class A221592 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221592() {
    super(new long[] {4, 4, 6, 0, 4, 3}, new long[] {0, 13, 35, 169, 651, 2715});
  }
}
