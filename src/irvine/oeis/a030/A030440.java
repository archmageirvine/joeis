package irvine.oeis.a030;

import irvine.oeis.LinearRecurrence;

/**
 * A030440.
 * @author Sean A. Irvine
 */
public class A030440 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030440() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 0, 7, 30});
  }
}
