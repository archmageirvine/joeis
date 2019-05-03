package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123296 Number of permutations of n distinct letters <code>(ABCD...)</code> each of which appears 5 times and having <code>n-2</code> fixed points.
 * @author Sean A. Irvine
 */
public class A123296 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123296() {
    super(new long[] {1, -3, 3}, new long[] {0, 25, 75});
  }
}
