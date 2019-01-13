package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081662.
 * @author Sean A. Irvine
 */
public class A081662 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081662() {
    super(new long[] {-1, 2, 1, -5, 4}, new long[] {1, 3, 7, 13, 22});
  }
}
