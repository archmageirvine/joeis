package irvine.oeis.a111;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A111277 Number of permutations avoiding the patterns {2413,4213,2431,4231,4321}; also number of permutations avoiding the patterns {3142,3412,3421,4312,4321}; number of weak sorting class based on 2413 or 3142.
 * @author Sean A. Irvine
 */
public class A111277 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111277() {
    super(new long[] {3, -7, 5}, new long[] {1, 1, 2});
  }
}
