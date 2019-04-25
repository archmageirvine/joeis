package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052388 Number of 4 X n binary matrices such that <code>any 2</code> rows have a common 1, up to column permutations.
 * @author Sean A. Irvine
 */
public class A052388 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052388() {
    super(new long[] {-1, 16, -120, 560, -1820, 4368, -8008, 11440, -12870, 11440, -8008, 4368, -1820, 560, -120, 16}, new long[] {0, 1, 16, 146, 955, 4905, 20907, 76851, 250530, 739612, 2009177, 5085119, 12109526, 27348478, 58955082, 121956402});
  }
}
