package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107388.
 * @author Sean A. Irvine
 */
public class A107388 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107388() {
    super(new long[] {1, -4, 0, 4}, new long[] {0, 1, -1, 2});
  }
}
