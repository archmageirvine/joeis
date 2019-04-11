package irvine.oeis.a208;

import irvine.oeis.LinearRecurrence;

/**
 * A208742 Number of subsets of the set <code>{1,2,...,n}</code> which do not contain two elements whose difference is 5.
 * @author Sean A. Irvine
 */
public class A208742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A208742() {
    super(new long[] {1, 1, -1, 0, 0, -3, -3, 3, 0, 0, -6, -6, 6, 0, 0, 3, 3, -3, 0, 0, 1, 1}, new long[] {2, 4, 8, 16, 32, 48, 72, 108, 162, 243, 405, 675, 1125, 1875, 3125, 5000, 8000, 12800, 20480, 32768, 53248, 86528});
  }
}
