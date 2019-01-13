package irvine.oeis.a282;

import irvine.oeis.LinearRecurrence;

/**
 * A282513.
 * @author Sean A. Irvine
 */
public class A282513 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282513() {
    super(new long[] {1, -2, 1, 0, -1, 2}, new long[] {0, 1, 3, 5, 8, 12});
  }
}
