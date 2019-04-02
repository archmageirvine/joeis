package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095154 Number of 5-block covers of a labeled n-set.
 * @author Sean A. Irvine
 */
public class A095154 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095154() {
    super(new long[] {9765, -15381, 6562, -1002, 57}, new long[] {21, 2919, 155106, 6054006, 208493607});
  }
}
