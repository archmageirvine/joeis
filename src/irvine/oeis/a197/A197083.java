package irvine.oeis.a197;

import irvine.oeis.LinearRecurrence;

/**
 * A197083.
 * @author Sean A. Irvine
 */
public class A197083 extends LinearRecurrence {

  /** Construct the sequence. */
  public A197083() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 10, 96, 445, 1431, 3681});
  }
}
