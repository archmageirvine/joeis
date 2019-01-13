package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218514.
 * @author Sean A. Irvine
 */
public class A218514 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218514() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {0, 0, 0, 0, 240, 80400, 4012560, 76848240, 825447840, 6005512800L, 33014872800L, 146953113120L, 554770648080L});
  }
}
