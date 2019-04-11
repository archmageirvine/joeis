package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111277 Number of permutations avoiding the patterns <code>{2413,4213,2431,4231,4321}</code>; also number of permutations avoiding the patterns <code>{3142,3412,3421,4312,4321}</code>; number of weak sorting class based on 2413 or 3142.
 * @author Sean A. Irvine
 */
public class A111277 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111277() {
    super(new long[] {3, -7, 5}, new long[] {1, 1, 2});
  }
}
