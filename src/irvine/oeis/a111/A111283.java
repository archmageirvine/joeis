package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111283 Number of permutations avoiding the patterns <code>{4321, 45132, 45231, 35412, 53412, 45213, 43512, 45312, 456123, 451623, 356124};</code> number of strong sorting class based on 4321.
 * @author Sean A. Irvine
 */
public class A111283 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111283() {
    super(new long[] {-1, 0, -3, 5}, new long[] {1, 2, 6, 23});
  }
}
