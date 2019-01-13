package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252985.
 * @author Sean A. Irvine
 */
public class A252985 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252985() {
    super(new long[] {1, -1, -1442, 1442, 1}, new long[] {1, 579, 1870, 835278, 2696899});
  }
}
