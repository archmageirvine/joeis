package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079825.
 * @author Sean A. Irvine
 */
public class A079825 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079825() {
    super(new long[] {-1, 1, 1, -1, 2, -2, -2, 2, -1, 1, 1}, new long[] {1, 3, 6, 15, 26, 41, 62, 92, 129, 169, 224});
  }
}
