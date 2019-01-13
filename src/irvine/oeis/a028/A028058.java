package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028058.
 * @author Sean A. Irvine
 */
public class A028058 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028058() {
    super(new long[] {-1080, 846, -231, 26}, new long[] {1, 26, 445, 6410});
  }
}
