package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111280 Number of permutations avoiding the patterns {4231, 4321, 35142, 45312, 42513, 45132, 35412, 45213, 43512, 456123, 351624, 451623, 356124}; number of strong sorting class based on 4231.
 * @author Sean A. Irvine
 */
public class A111280 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111280() {
    super(new long[] {-1, 0, 4, -2, 4}, new long[] {1, 2, 6, 22, 113});
  }
}
