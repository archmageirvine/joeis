package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069760.
 * @author Sean A. Irvine
 */
public class A069760 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069760() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {47, 287, 959, 2399, 5039});
  }
}
