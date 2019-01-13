package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168053.
 * @author Sean A. Irvine
 */
public class A168053 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168053() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 1, -1, -3});
  }
}
