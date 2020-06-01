package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111285 Number of permutations avoiding the patterns <code>{2431, 3421, 4231, 4321, 24513, 42513, 34512, 43512};</code> number of strong sorting class based on 2431.
 * @author Sean A. Irvine
 */
public class A111285 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111285() {
    super(new long[] {2, -3, 4}, new long[] {1, 2, 6});
  }
}
