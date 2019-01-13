package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112421.
 * @author Sean A. Irvine
 */
public class A112421 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112421() {
    super(new long[] {1, -2, 1, 0, 0, 0, -1, 2}, new long[] {2, 4, 6, 8, 10, 12, 16, 20});
  }
}
