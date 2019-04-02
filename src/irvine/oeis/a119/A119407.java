package irvine.oeis.a119;

import irvine.oeis.LinearRecurrence;

/**
 * A119407 Number of nonempty subsets of {1,2,...,n} with no gap of length greater than 4 (a set S has a gap of length d if a and b are in S but no x with a&lt;x&lt;b is in S, where b-a=d).
 * @author Sean A. Irvine
 */
public class A119407 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119407() {
    super(new long[] {1, -1, 0, 0, -2, 3}, new long[] {1, 3, 7, 15, 31, 62});
  }
}
