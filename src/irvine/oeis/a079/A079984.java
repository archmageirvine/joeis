package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079984.
 * @author Sean A. Irvine
 */
public class A079984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079984() {
    super(new long[] {-1, -1, 1, -1, -1, -1, 3, 4, -4, 2, 4, -2, -4, -4, 3, 1, -1, 1, 1, 1}, new long[] {1, 1, 1, 1, 2, 5, 10, 16, 26, 43, 80, 148, 264, 465, 816, 1444, 2588, 4619, 8214, 14591});
  }
}
