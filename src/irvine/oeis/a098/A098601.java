package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098601.
 * @author Sean A. Irvine
 */
public class A098601 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098601() {
    super(new long[] {1, 2, 1, -1}, new long[] {1, 1, 0, 3});
  }
}
