package irvine.oeis.a030;

import irvine.oeis.LinearRecurrence;

/**
 * A030434.
 * @author Sean A. Irvine
 */
public class A030434 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030434() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-42, -15, -4, -1});
  }
}
