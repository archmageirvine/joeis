package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026937.
 * @author Sean A. Irvine
 */
public class A026937 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026937() {
    super(new long[] {-1, -4, -2, 4}, new long[] {1, 3, 10, 30});
  }
}
